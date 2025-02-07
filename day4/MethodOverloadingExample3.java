package com.celcom.day4;

public class MethodOverloadingExample3 {
	void concate(int num1,int num2) {
		System.out.println("The Concatenation of two Integers: "+(num1+num2));
	}
	void concate(String str1,String str2) {
		System.out.println("The Concatenation of two Strings: "+(str1+str2));
	}
	void concate(double num1,double num2) {
		System.out.println("The Concatenation of two Integers: "+(num1+num2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample3 obj=new MethodOverloadingExample3();
		obj.concate("Hello","World");
		obj.concate(34, 54);
		obj.concate(345.6, 789.45);

	}

}
