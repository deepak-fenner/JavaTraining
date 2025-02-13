package com.celcom.day8;

public class StringMethodExample1 {

	public static void main(String[] args) {
		String s1="Java";
		System.out.println("The length of String is :"+s1.length());//4
		System.out.println("Character At index 1 :"+s1.charAt(1));//a
		System.out.println("Lowercase: "+s1.toLowerCase());//java
		System.out.println("UpperCase: "+s1.toUpperCase());//JAVA
		
		System.out.println("Concatenation: "+s1.concat(" World"));//Java World
		System.out.println("Replacing Character: "+s1.replace('a', 'z'));//jzvz
		
		System.out.println(s1.equals("java"));//false
		System.out.println(s1.equalsIgnoreCase("java"));//true
		
		System.out.println(s1.contains("ava"));//true
		System.out.println(s1.startsWith("j"));//false
		System.out.println(s1.endsWith("a"));//true
		
		String s2="Java World";
		System.out.println(s2.substring(1,4));//ava
		
		System.out.println(s2.substring(0));//Java World

	}

}
