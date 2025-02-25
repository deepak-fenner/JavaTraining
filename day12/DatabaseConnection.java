package com.celcom.day12;
import java.sql.*;
public class DatabaseConnection {
	private static final String url="jdbc:mysql://localhost:3306/company";
	private static final String user="root";
	private static final String password="87654321";
	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return  DriverManager.getConnection(url,user,password);
		}
		catch(Exception e) {
			System.out.println("database not connected...");
			e.printStackTrace();
			
		}
		return null;
		}
		
}
