package com.celcom.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Sorting {

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
		//ascending order
		Collections.sort(list,new Comparator<Integer>() {
			@Override
			public int compare(Integer a,Integer b) {
				return a-b;
			}
		});
		list.stream().forEach(i->System.out.print(i+" "));
		
		//descending order
		
		Collections.sort(list,new Comparator<Integer>() {
			@Override
			public int compare(Integer a,Integer b) {
				return b-a;
			}
		});
		
		
		//using lambda expression
		list.sort((a,b)->Integer.compare(a,b));
		
		
		
		//printing
		list.stream().forEach(i->System.out.print(i+" "));
		
	}

}
