package com.celcom.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EqualElementsInArrayLists {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer>list1=new ArrayList<>();
		List<Integer>list2=new ArrayList<>();
		int choice;
		do {
			System.out.println("Enter 1---->To add Element to list1");
			System.out.println("Enter 2---->To add Element to list2");
			System.out.println("Enter 3---->To Exit");
			System.out.println("Enter the choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the Element to add to list1:");
				int num1=sc.nextInt();
				list1.add(num1);
				break;
			case 2:
				System.out.println("Enter the Element to add to list2:");
				int num2=sc.nextInt();
				list2.add(num2);
				break;
			case 3:
				break;
			}
			
		}while(choice!=3);
		Collections.sort(list1);
		Collections.sort(list2);
		if(list1.equals(list2)) {
			System.out.println("Both ArrayLists are Equal");
		}
		else {
			System.out.println("ArrayLists are Different");
		}

	}

}
