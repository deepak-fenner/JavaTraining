package com.celcom.day1;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean exit=true;
		do {
			System.out.println("Enter the first number:");
			int num1=sc.nextInt();
			System.out.println("Enter the second number:");
			int num2=sc.nextInt();
			System.out.println("Choose a number so that the operation can performed:1--->Addition,2--->Subtraction,3--->Multiplication,4--->Division,5---Exit");
			int choosingOperator=sc.nextInt();
			switch(choosingOperator) {
			case 1:
				System.out.println("Addition of 2 numbers is:"+(num1+num2));
				break;
			case 2:
				System.out.println("Subtraction of 2 numbers is:"+(num1-num2));
				break;
			case 3:
				System.out.println("Multiplication of 2 numbers is:"+(num1*num2));
				break;
			case 4:
				if(num2==0) {
					System.out.println("Zero Division Error");
				}
				System.out.println("Addition of 2 numbers is:"+(num1/num2));
				break;
			case 5:
				exit=false;
				System.out.println("Exited");
				break;
			default:
				System.out.println("Invalid Operator try again.....");	
			}
			
		}while(exit);		

	}

}
