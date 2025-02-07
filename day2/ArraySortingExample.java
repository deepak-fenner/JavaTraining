package com.celcom.day2;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySortingExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the Array:");
		int size=sc.nextInt();
		int[]arr=new int[size];
		System.out.println("Enter the "+size+" values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("The Sorted Array is:");
		for(int index:arr) {
			System.out.print(index+" ");
		}
		System.out.println();
		System.out.println("First Minimum value: "+arr[0]);
		System.out.println("Second Minimum value: "+arr[1]);
		System.out.println("First Maximum value: "+arr[arr.length-1]);
		System.out.println("Second Maximum value: "+arr[arr.length-2]);
		//reversing the array
		System.out.println("The array in descending order:");
		for(int index=arr.length-1;index>=0;index--) {
			System.out.print(arr[index]+" ");
		}

	}

}
