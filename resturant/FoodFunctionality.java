package com.celcom.resturant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FoodFunctionality implements FoodFunctionalityOverview{
	static Connection conn=DBConnection.getConnection();
	public void displayMenu() {
		System.out.println("The Menu Items are as follows:");
		try {
		String displayQuery="select * from resturantMenu";
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(displayQuery);
		System.out.println("MENU_ID"+"  |  "+"FOOD_NAME"+"  |  "+"CATEGORY"+"  |  "+"PRICE");
		System.out.println("-----------------------------------------------------------");
		 while(rs.next()) {
			 System.out.println();
			 System.out.println(rs.getInt(1)+"           "+rs.getString(2)+"         "+rs.getString(3)+"        "+rs.getDouble(4));
			 System.out.println();
			 System.out.println("-----------------------------------------------------------");
		 }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
