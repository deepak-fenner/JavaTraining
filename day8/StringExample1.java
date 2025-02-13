package com.celcom.day8;

public class StringExample1 {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2=new String("Java");
		
		char ch[]= {'h','i'};
		String s3=new String(ch);
		String s4=String.valueOf(ch);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		

	}

}
