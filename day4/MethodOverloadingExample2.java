package com.celcom.day4;

public class MethodOverloadingExample2 {
	void addition(int num1,int num2) {
		System.out.println("The Addition of two integer numbers: "+(num1+num2));
	}
	void addition(double num1,double num2) {
		System.out.println("The Addition of two double numbers: "+(num1+num2));
	}
	void addition(long num1,long num2) {
		System.out.println("The Addition of two long numbers: "+(num1+num2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample2 obj=new MethodOverloadingExample2();
		obj.addition(5.0, 34.9);
		obj.addition(5, 8);
		obj.addition(34L,245L);

	}

}
