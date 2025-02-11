package com.celcom.day6;

public class TryCatchExample2 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
		 int[]a=new int[-5];
		} 
		catch (ArithmeticException e) {
			System.out.println("A");
		}
		catch(NumberFormatException e) {
			System.out.println("B");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("C");
		}
		finally {
			System.out.println("Inside Finally");
		}
		System.out.println("After Exception");

	}

}
