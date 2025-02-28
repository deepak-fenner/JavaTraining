package com.celcom.day15;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ecommerce {
	static Scanner sc=new Scanner(System.in);
	static Deque<String>cart=new ArrayDeque<>();
	public static void main(String[] args) {
		int choice;
		int capacity=5;
		do {
			System.out.println("Enter 1------>add a product into cart(max capacity:10):");
			System.out.println("Enter 2------>view all the products");
			System.out.println("Enter 3------>To add a new product and remove LRU");
			System.out.println("Enter 4------>To exit");
			System.out.println("Enter the choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the product name:");
				String product=sc.next();
				if(cart.size()<capacity) {
					cart.addFirst(product);
				}
				else {
				   System.out.println("Cart is full");
				   break;
				}
				break;
			case 2:
				System.out.println("The products in the cart are:");
				for(String i:cart) {
					System.out.println(i);
				}
				break;
			case 3:
				System.out.println("Enter a product:");
				String product1=sc.next();
				cart.removeLast();
				cart.addFirst(product1);
			    System.out.println("Product added to cart successfully");
			    break;
			case 4:
				System.out.println("Program Ended");
				break;
			}
			
		}while(choice!=4);
	   
	}

}
