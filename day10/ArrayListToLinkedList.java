package com.celcom.day10;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer>array=new ArrayList<>();
		int choice;
		do {
			System.out.println("Enter 1---->To add Element to list");
			System.out.println("Enter 2---->To Exit");
			System.out.println("Enter the choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the Element:");
				int num=sc.nextInt();
				array.add(num);
				break;
			case 2:
				break;
			}
			
		}while(choice!=2);
		List<Integer>list=new LinkedList<>(array);
		System.out.println("Conversion of ArrayList from LinkedList:");
		for(Integer i:list) {
			System.out.print(i+" ");
		}
		
	}

}
