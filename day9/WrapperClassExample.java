package com.celcom.day9;

public class WrapperClassExample {

	public static void main(String[] args) {
		//converting primitive value into Wrapper class
		int a=10;
		Integer obj1=new Integer(a);//Boxing
		
		//converting Wrapper class into primitive value
		int b=obj1.intValue();//UnBoxing
		
		//converting primitive value into Wrapper class
		Integer obj2=a;//Auto-Boxing
		
		//converting Wrapper class into primitive value
		int c=obj2;//Auto Un-Boxing
		
		
		
	}

}
