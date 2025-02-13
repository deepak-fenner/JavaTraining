package com.celcom.day8;

public class StringMethodExample2 {

	public static void main(String[] args) {
		String s1="Java";
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		for(char ch:s1.toCharArray()) {
			System.out.println(ch);
		}
		s1.chars().forEach(ch->System.out.println((char)ch));
		
		s1.chars().mapToObj(c->(char)c).forEach(System.out::println);
		
		String s2="Welcome to Java Programming";
		String[] temp=s2.split(" ");
		for(String i:temp) {
			System.out.println(i);
		}
		
		String val="Functional";
		val.chars().mapToObj(c->(char)c).filter(c->"AEIOUaeiou".indexOf(c)!=-1).forEach(System.out::println);
	}

}
