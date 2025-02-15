package com.celcom.saturday_assignment_15th_Feb_2025;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer>list=new ArrayList<>();
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
		System.out.println("The Reversed List is:");
		Collections.sort(list,Collections.reverseOrder());
		for(Integer i:list) {
			System.out.println(i);
		}

	}

}
