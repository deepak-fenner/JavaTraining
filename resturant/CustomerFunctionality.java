package com.celcom.resturant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.util.Scanner;

public class CustomerFunctionality implements CustomerFunctionalityOverview{
	   static Connection conn=DBConnection.getConnection();
	   static FoodFunctionality foodobj=new FoodFunctionality();
	   static Scanner sc=new Scanner(System.in);
	   static Random random=new Random();
	   public void customerRegistration() {
		    System.out.println("Enter your FirstName: ");
		    String firstName=sc.next();
		    System.out.println("Enter your LastName: ");
		    String lastName=sc.next();
		    System.out.println("Enter your Mobile Number:");
		    long mobileNumber=sc.nextLong();
		    System.out.println("Enter your Email Id:");
		    String email=sc.next();
		    System.out.println("Enter the Address:");
		    String address=sc.next(); 
		    CustomerDAO newCustomer=new CustomerDAO(firstName,lastName,mobileNumber,email,address);
		    try{
		    	 int accountNumber=100000+random.nextInt(900000);
		    	 String insertQuery="insert into resturantCustomer values(?,?,?,?,?,?)";
		    	 PreparedStatement ps=conn.prepareStatement(insertQuery);
		    	 ps.setInt(1, accountNumber);
		    	 ps.setString(2,firstName);
		    	 ps.setString(3,lastName);
		    	 ps.setLong(4, mobileNumber);
		    	 ps.setString(5,email);
		    	 ps.setString(6,address);
		    	 int updated=ps.executeUpdate();
		    	 if(updated>0) {
		    		 System.out.println("Customer Added sucessfully.....");
		    		 System.out.println("Customer Account Number is: "+accountNumber);
		    	 }
		    	 else {
		    		 System.out.println("Invalid Credentials...:");
		    	 }
		    	 ps.close();
		    }
		    catch(Exception e) {
		    	e.printStackTrace();
		    }
	   }
	  
	   public void placeOrder() {
		   System.out.println("MENU CARD");
		   System.out.println();
		   foodobj.displayMenu();
		   System.out.println("Enter your Account Number to start placing order:");
		   int accountNumber=sc.nextInt();
		   try {
			   String fetchAccount="select * from resturantCustomer where account_number=?";
			   PreparedStatement ps1=conn.prepareStatement(fetchAccount);
			   ps1.setInt(1, accountNumber);
			   ResultSet rs=ps1.executeQuery();
			   if(!rs.next()) {
				   System.out.println("Account is not available");
			   }
			   else {
				   ps1.close();
				   System.out.println("Enter the menu_id to order the particular food:");
				   int foodid=sc.nextInt();
				   System.out.println("Enter the quantity:");
				   int quantity=sc.nextInt();
				   String insertQuery1="insert into resturantOrder(account_number,menu_id,quantity) values (?,?,?)";
				   PreparedStatement ps2=conn.prepareStatement(insertQuery1);
				   ps2.setInt(1,accountNumber);
				   ps2.setInt(2,foodid);
				   ps2.setInt(3, quantity);
				   int inserted=ps2.executeUpdate();
				   if(inserted>0) {
					   System.out.println("Order is placed.."+"Please wait while the food is getting prepared");
				   }
				   else {
					   System.out.println("Order is not placed...");
				   }  
			   }
		   }
		   catch(Exception e) {
			   e.printStackTrace();
		   }
		   
	   }
	  
	   
}
