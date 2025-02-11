package com.celcom.day6;
import java.util.Scanner;

class InvalidAgeException extends Exception{
	int age;
	InvalidAgeException(int age){
		this.age=age;
	}
	@Override
	public String toString() {
		return age+"-Invalid Age for Voting";
	}
}
public class ThrowsExample2 {

	public static void main(String[] args) {
		System.out.println("Enter your age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Welcome to Vote");
		}
		else {
			try {
				throw new InvalidAgeException(age);
			}   
			catch(InvalidAgeException e) {
				System.out.println(e);
			}
		}

	}
}
