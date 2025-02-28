package com.celcom.resturant;

import java.util.Scanner;

public class MainClass {
	static Scanner sc=new Scanner(System.in);
	static CustomerFunctionality customerobj=new CustomerFunctionality();
	static FoodFunctionality foodobj=new FoodFunctionality();
	public static void main(String[] args) {
		PriceBilling bill=new PriceBilling();
		bill.Billing();
		int choice;
		do {
			System.out.println("Enter 1------->To register new Customer: ");
			System.out.println("Enter 2------->To display menu");
			System.out.println("Enter 3------->To place order");
			System.out.println("Enter 4------->To Exit");
			System.out.println("Enter a choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				customerobj.customerRegistration();
				break;
			case 2:
				foodobj.displayMenu();
				break;
			case 3:
				customerobj.placeOrder();
				break;
			case 4:
				System.out.println("Program Ended.....");
				break;
			}
		}
		while(choice!=4);
	}

}
