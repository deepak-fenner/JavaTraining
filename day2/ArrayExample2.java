package com.celcom.day2;
import java.util.Scanner;
public class ArrayExample2 {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int sum=0;
		int evenCount=0,oddCount=0;
		System.out.println("The initial values of the Array are:");
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the five values");
		for(int index=0;index<arr.length;index++) {
			arr[index]=sc.nextInt();
		}
		System.out.println("The values after the user input are:");
		for(int index=0;index<arr.length;index++) {
			sum+=arr[index];
			System.out.println(arr[index]);
			if(arr[index]%2==0) {
				evenCount+=1;
			}
			else {
				oddCount+=1;
			}
		}
		System.out.println("The sum of the elements is "+sum);
		System.out.println("The count of even numbers in the array is "+evenCount);
		System.out.println("The count of odd numbers in the array is "+oddCount);
	}

}
