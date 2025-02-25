package com.celcom.day13;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayGenericExample {
	
	public static<T> boolean arrayEquals(T[] array1,T[] array2) {
		   return Arrays.equals(array1,array2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		Integer[]array1=new Integer[num1];
		System.out.println("Enter the elements in array1");
		for(int i=0;i<num1;i++) {
			array1[i]=sc.nextInt();
		}
		int num2=sc.nextInt();
		Integer[]array2=new Integer[num2];
		System.out.println("Enter the elements in array2");
		for(int i=0;i<num2;i++) {
			array2[i]=sc.nextInt();
		}
		if(num1!=num2) {
			System.out.println("Arrays is not equal");
		}
		else {
			if(arrayEquals(array1,array2)) {
				System.out.println("Arrays are Equal");
			}
			else {
				System.out.println("Arrays is not equal");
			}
		}

	}

}
