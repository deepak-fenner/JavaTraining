package com.celcom.day4;

public class MethodOverloadingExample1 {
	
	void myMethod(int number) {
		int factorial=1;
		for(int i=1;i<=number;i++) {
			factorial*=i;
		}
		System.out.println("The Factorial of "+(number)+" is: "+(factorial));
		
	}
	void myMethod(int number1,int number2) {
		int add=number1+number2;
		System.out.println("The Addition of Two numbers: "+add);
		
	}
	void myMethod(String name) {
		System.out.println("Welcome: "+name);
		
	}
	public static void main(String[] args) {
		MethodOverloadingExample1 obj=new MethodOverloadingExample1();
		obj.myMethod(5);
		obj.myMethod("Deepak");
		obj.myMethod(4, 5);
		

	}

}
