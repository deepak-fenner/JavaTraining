package com.celcom.saturday_assignment_15th_Feb_2025;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CopyList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer>list=new LinkedList<>();
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
				list.add(num);
				break;
			case 2:
				break;
			}
			
		}while(choice!=2);
		
		List<Integer>copylist=new LinkedList<>(list);
		System.out.println("The elements in the List:");
		for(Integer i:copylist) {
			System.out.print(i+" ");
		}
		

	}

}
