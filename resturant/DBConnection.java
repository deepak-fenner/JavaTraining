package com.celcom.resturant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private static final String url="jdbc:oracle:thin:@172.19.0.5:1521/trainingsql.celcom.com";
	private static final String username="training";
	private static final String password="Celcom123";
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			System.out.println("Database connected Failed");
			e.printStackTrace();
		}
		return null;
	}
}
