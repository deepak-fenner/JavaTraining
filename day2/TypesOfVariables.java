package com.celcom.day2;

public class TypesOfVariables {
	int b=20;//Instance or Object Variable
	static int c=30;//static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;//local variable
		System.out.println(a);
		//accessing instance and static variable
		TypesOfVariables type=new TypesOfVariables();
		System.out.println(type.b);
		System.out.println(TypesOfVariables.c);

	}

}
