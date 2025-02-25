package com.celcom.day12;
import java.sql.*;
import java.util.*;
public class EmployeeManagement {
	static Connection conn=DatabaseConnection.getConnection();
	static Scanner sc=new Scanner(System.in);
	public static void addEmployee() throws Exception{
		System.out.println("Enter the Name:");
		String name=sc.next();
	    System.out.println("Enter the Age:");
	    int age=sc.nextInt();
	    System.out.println("Enter the email:");
	    String email=sc.next();
	    System.out.println("Enter the Address");
	    String address=sc.next();
	    Employee employee=new Employee(name,age,email,address);
	    String query="insert into employee (name,age,email,address) values(?,?,?,?)";
	    PreparedStatement ps=null;
	    ps=conn.prepareStatement(query);
	    ps.setString(1,name);
	    ps.setInt(2, age);
	    ps.setString(3,email);
	    ps.setString(4,address);
	    ps.executeUpdate();
	    System.out.println("Details added successfully");
	    System.out.print("The employeeId is: ");
	    String idQuery="select empId from employee order by empId desc limit 1";
	    ps=conn.prepareStatement(idQuery);
	    ResultSet rs=ps.executeQuery();
	    if(rs.next())
	    {
	    System.out.print(rs.getInt("empId"));
	    }
	    System.out.println();
	}
	public static void displayEmployee() throws Exception{
		System.out.println("The details are as follows:");
		Statement stmt=conn.createStatement();
		String query="select * from employee";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println("Employee Id is: "+rs.getInt(1));
			System.out.println("Employee Name is: "+rs.getString(2));
			System.out.println("Employee Age is: "+rs.getInt(3));
			System.out.println("Employee Email is: "+rs.getString(4));
			System.out.println("Employee Address is: "+rs.getString(5));
			System.out.println("---------------------------------------");
			
		}
	}
	public static void deleteEmployee()throws Exception{
		System.out.println("Choose a employee id from the following to delete specific employee detail:");
		displayEmployee();
		System.out.println("Enter Employee Id:");
		int id=sc.nextInt();
		String query="delete from employee where empId=?";
		PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1, id);
		int affected=ps.executeUpdate();
		if(affected>0) {
			System.out.println("Employee detail is removed successfully");
		}
		else {
			System.out.println("Enter the correct Employee Id");
		}
	}
	public static void updateAddress()throws Exception{
		System.out.println("Choose a employee id from the following to update the address of specific employee:");
		displayEmployee();
		System.out.println("Enter Employee Id:");
		int id=sc.nextInt();
		PreparedStatement ps=null;
		ResultSet rs=null;
		String addressval="";
		String selectAddress="select address from employee where empId=?";
		ps=conn.prepareStatement(selectAddress);
		ps.setInt(1,id);
		rs=ps.executeQuery();
		if(rs.next()) {
			addressval=rs.getString("address");
		}
		System.out.println("Enter the new address:");
		String newaddress=sc.next();
		String updateAddress="update employee set address=? where empId=?";
		ps=conn.prepareStatement(updateAddress);
		ps.setString(1,newaddress);
		ps.setInt(2, id);
		int affected=ps.executeUpdate();
		if(affected>0) {
			System.out.println("Employee address is updated successfully");
		}
		else {
			System.out.println("Enter the correct Employee Id");
		}
	}  
	public static void main(String[] args) throws Exception{
		int choice;
		do {
			System.out.println("Enter 1----->to Add the employee details:");
			System.out.println("Enter 2----->to Delete the detail of a particular employee");
			System.out.println("Enter 3----->to update employee address.");
			System.out.println("Enter 4----->to Display the details");
			System.out.println("Enter 5----->to exit");
			System.out.println("Enter a choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
			    addEmployee();
			    break;
			case 2:
				deleteEmployee();
				break;
			case 3:
				updateAddress();
				break;
			case 4:
				displayEmployee();
				break;
			case 5:
				System.out.println("Program ended successfully");
				break;
			}
		}
		while(choice!=5);

	}

}
