package com.celcom.day13;

import java.sql.*;
public class DBConnection {
	   private static final String url = "jdbc:oracle:thin:@localhost:1522:XE";
       private static final String username = "SYSTEM";
       private static final String password = "12345678";
	
	public static Connection getConnection() {
	        try {
	        	return DriverManager.getConnection(url, username, password);
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
	        return null;
	}
}
