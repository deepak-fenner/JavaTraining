package com.celcom.day6;
import java.util.Scanner;
class VowelNotFoundException extends Exception{
	@Override
	public String toString() {
		return "Vowel is not present in the String";
	}
}
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String:");
			String str=sc.next();
			boolean flag=false;
			for(char ch:str.toCharArray()) {
				char ch1=Character.toLowerCase(ch);
				if(ch1=='a'|| ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u') {
					flag=true;
					break;
				}
			}
			if(flag==true) {
				System.out.println("Vowel is present in the string");
			}
			else {
				throw new VowelNotFoundException();
			}
			
		}
		catch(VowelNotFoundException e) {
			System.out.println(e);
		}

	}
}
