package com.celcom.day8;

public class StringMethodExample3 {

	public static void main(String[] args) {
		String s1="Java";
		s1.concat(" World");
		System.out.println(s1);//Java
		s1=s1.concat(" World");
		System.out.println(s1);//Java World
		
		
		//StringBuffer
		StringBuffer sb=new StringBuffer("Java");
		System.out.println("Capacity: "+sb.capacity());//16+4=20
		sb.append(" World");
		System.out.println(sb.toString());
		
		
		//StringBuilder
		StringBuilder sb1=new StringBuilder("Java1");
		sb1.append(" World1");
		System.out.println(sb1.toString());
		

	}

}
