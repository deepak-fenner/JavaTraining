package com.celcom.day6;

public class TryCatchExample1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
		 int[]a=new int[-5];
		} catch (ArithmeticException e) {
			System.out.println("A");
		}
		catch(NumberFormatException e) {
			System.out.println("B");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("C");
			try {
				String str="ABC";
				System.out.println(str.charAt(3));
			}
			catch(StringIndexOutOfBoundsException e1) {
				System.out.println("C1");
			}
		}
		catch(Exception e) {//global catch block
			System.out.println("D");
		}
		System.out.println("After Exception");

	}

}
