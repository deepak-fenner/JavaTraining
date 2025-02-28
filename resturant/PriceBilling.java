package com.celcom.resturant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


class Task implements Runnable{
	static Connection conn=DBConnection.getConnection();
	String selectQuery="select * from resturantOrder";
	String checkStatus="select order_id,account_number,menu_id,quantity from resturantOrder where status='New'";
	@Override
	public void run() {
		try {
			PreparedStatement ps=conn.prepareStatement(selectQuery);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				 PreparedStatement ps1=conn.prepareStatement(checkStatus);
				 ResultSet rs1=ps1.executeQuery();
				 int ans=0;
				 int order1=0;
				 int quantity1=0;
				 if(rs1.next()) {
					 order1+=rs1.getInt("order_id");
					 ans+=rs1.getInt("menu_id");
					 quantity1+=rs1.getInt("quantity");
				 }
				 String price="select price from resturantMenu where menu_id=?";
				 PreparedStatement ps2=conn.prepareStatement(price);
				 ps2.setInt(1,ans);
				 ResultSet rs2=ps2.executeQuery();
				 double val=0.0;
				 if(rs2.next()) {
					 val+=rs2.getDouble("price");
				 }
				 double updatedprice=(double)(val*quantity1);
				 String Completed="Completed";
				 String update="update resturantOrder set price=?,status=? where order_id=?";
				 PreparedStatement ps3=conn.prepareStatement(update);
				 ps3.setDouble(1, updatedprice);
				 ps3.setString(2,Completed);
				 ps3.setInt(3, order1);
				 int affected=ps3.executeUpdate();
				 if(affected==1) {
					 System.out.println("The Food is prepared for order_id: "+order1+". And the price is: "+updatedprice);
				 } 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
public class PriceBilling {
	static ScheduledExecutorService executor=Executors.newScheduledThreadPool(1);
	 public static void Billing() {
		 executor.scheduleAtFixedRate(new Task(),0, 30,TimeUnit.SECONDS);
		 executor.schedule(()->executor.shutdown(),2, TimeUnit.MINUTES);
	 }
}
