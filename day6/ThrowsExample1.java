package com.celcom.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample1 {
	static void m1() throws FileNotFoundException{//used to avoid compileTime exception
		FileReader f=new FileReader("Test.txt");
	}
	static void m2() {
		try {
			m1();
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args){
		ThrowsExample1.m2();
		int a=10/0;
		throw new ArithmeticException();//used to manually throw exceptions.
	}

}
