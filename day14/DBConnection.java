package com.celcom.day14;
import java.sql.*;

public class DBConnection{
	private static final String url = "jdbc:oracle:thin:@172.19.0.5:1521/trainingsql.celcom.com";
	private static final String username = "training";
	private static final String password = "Celcom123";
	
	public static Connection getConnection() throws Exception{
		return DriverManager.getConnection(url,username,password);
	}
}
