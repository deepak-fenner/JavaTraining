package com.celcom.day13;
import java.sql.*;
public class SampleConnection {
	 private static final String url = "jdbc:oracle:thin:@//172.19.0.5:1521/trainingsql.celcom.com";
     private static final String username = "training";
     private static final String password = "Celcom123";
	public static void main(String[] args) throws Exception {
		Connection conn=DriverManager.getConnection(url,username,password);
		PreparedStatement ps=conn.prepareStatement("select * from oracle");
		ResultSet rs=ps.executeQuery();
//		rs.next();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		
	}

}
