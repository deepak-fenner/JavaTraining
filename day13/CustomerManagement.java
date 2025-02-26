package com.celcom.day13;
import java.util.*;
import java.sql.*;
import java.sql.Date;
public class CustomerManagement {
	static Connection conn=DBConnection.getConnection();
	static Scanner sc=new Scanner(System.in);
	
	public static void addCustomer() throws Exception{
		System.out.println("Enter the Name");
		String name=sc.next();
		System.out.println("Enter the Date of Birth");
		String dob=sc.next();
		System.out.println("Enter the Address:");
		String address=sc.next();
		System.out.println("Enter Father's Name:");
		String father_name=sc.next();
		System.out.println("Enter Aadhar Number:");
		long aadhar_number=sc.nextLong();
		System.out.println("Enter Phone NUmber:");
		long phone_number=sc.nextLong();
		CustomerDAO customer=new CustomerDAO(name,dob,address,father_name,aadhar_number,phone_number);
		PreparedStatement ps=null;
		String insertQuery="insert into customer values(?,?,?,?,?,?)";
		ps=conn.prepareStatement(insertQuery);
		ps.setString(1,customer.getName());
		ps.setDate(2,Date.valueOf(customer.getDob()));
		ps.setString(3,customer.getAddress());
		ps.setString(4,customer.getFatherName());
		ps.setLong(5,customer.getAadharNumber());
		ps.setLong(6,customer.getPhoneNumber());
		int affected=ps.executeUpdate();
		if(affected>0) {
			System.out.println("Customer Details added successfully");
		}
		else {
			System.out.println("Invalid input field..");
		}
	}
	public static void deleteCustomer() throws Exception{
		System.out.println("Enter the Aadhaar Number to delete the customer details:");
		long inputAadhar=sc.nextLong();
		String deleteQuery="delete from customer where aadhar_number=?";
		PreparedStatement ps=conn.prepareStatement(deleteQuery);
		ps.setLong(1, inputAadhar);
		int affected=ps.executeUpdate();
		if(affected>0) {
			System.out.println("Customer details deleted successfully.....");
		}
		else {
			System.out.println("Enter the correct aadhar number...");
		}
	}
	public static void displayCustomer() throws Exception{
		System.out.println("The Customer Details are as follows");
		String displayQuery="select * from customer";
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(displayQuery);
		while(rs.next()) {
			System.out.println("Customer Name is: "+rs.getString(1));
			System.out.println("Customer Date Of Birth is: "+rs.getDate(2));
			System.out.println("Customer Address: "+rs.getString(3));
			System.out.println("Customer's Father Name: "+rs.getString(4));
			System.out.println("Customer's Aadhar Number:"+rs.getLong(5));
			System.out.println("Customer's Phone Number: "+rs.getLong(6));	
			System.out.println("----------------------------------------");
		}
		
	}
	public static void updateCustomer() throws Exception{
		System.out.println("Enter the Aadhaar Number to update the customer phone number:");
		long inputAadhar=sc.nextLong();
		System.out.println("Enter the mobile number to update:");
		long inputMobile=sc.nextLong();
		String updateQuery="update customer set phone_number=? where aadhar_number=?";
		PreparedStatement ps=conn.prepareStatement(updateQuery);
		ps.setLong(1, inputMobile);
		ps.setLong(2, inputAadhar);
		int affected=ps.executeUpdate();
		if(affected>0) {
			System.out.println("Customer phone number updated successfully.....");
		}
		else {
			System.out.println("Enter the correct aadhar number...");
		}
		
	}
}
