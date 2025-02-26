package com.celcom.day13;

import java.util.Scanner;

public class MainClass {
	static CustomerManagement obj=new CustomerManagement();
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) throws Exception
	{
		int choice;
		do {
			System.out.println("Enter 1---->to add new customer.");
			System.out.println("Enter 2---->to delete a customer");
			System.out.println("Enter 3---->to update a customer");
			System.out.println("Enter 4---->to display customer details");
			System.out.println("Enter 5---->To exit");
			System.out.println("Enter a choice");
			choice=sc.nextInt();
			switch(choice) 
			{
			case 1:
				obj.addCustomer();
				break;
			case 2:
				obj.deleteCustomer();
				break;
			case 3:
				obj.updateCustomer();
				break;
			case 4:
				obj.displayCustomer();
				break;
			case 5:
				System.out.println("Program ended successfully");
				break;
				
			}
		}while(choice!=5);

	}
}
