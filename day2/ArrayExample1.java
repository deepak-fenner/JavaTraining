package com.celcom.day2;

public class ArrayExample1 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int sum=0;
		System.out.println("The length of the array is "+arr.length);
		System.out.println("The Elements of the array are:");
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("The sum of the elements is :"+sum);
		System.out.println("The elements printed using for each loop:");
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
