package com.celcom.day4;
//constructor overloading
public class ConstructorOverloadingExample1 {
	ConstructorOverloadingExample1(int num1,int num2) {
		this(2.3,4.5);
		System.out.println("The Addition of two integer numbers: "+(num1+num2));
	}
	ConstructorOverloadingExample1(double num1,double num2) {
		this(600L,400L);
		System.out.println("The Addition of two double numbers: "+(num1+num2));
	}
	ConstructorOverloadingExample1(long num1,long num2) {
		System.out.println("The Addition of two long numbers: "+(num1+num2));
	}

	public static void main(String[] args) {
		ConstructorOverloadingExample1 obj=new ConstructorOverloadingExample1(10,20);
//		ConstructorOverloadingExample1 obj1=new ConstructorOverloadingExample1(34.6,345.78);
//		ConstructorOverloadingExample1 obj2=new ConstructorOverloadingExample1(100L,2000L);
		

	}

}
