package com.celcom.day13;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;
public class GenericExample {
	
	public static<T> List<T> merge(List<T> list1,List<T> list2) {
		int i=0;
		int j=0;
		List<T> ans=new ArrayList<>();
		while(i<list1.size() || j<list2.size()) {
			if(i<list1.size()) {
				ans.add(list1.get(i));
				i+=1;
			}
			if(j<list2.size()) {
				ans.add(list2.get(j));
				j+=1;
			}
			else if(i<list1.size() && j==list2.size()) {
				ans.add(list1.get(i));
				i+=1;
			}
			else if(i==list1.size() && j<list2.size()) {
				ans.add(list2.get(j));
				j+=1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		List<Integer>list1=new ArrayList<>();
		List<Integer>list2=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter 1---->to add in list1");
			System.out.println("Enter 2---->to add in list2");
			System.out.println("Enter 3---->to exit");
			System.out.println("Enter a choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the element");
				int num1=sc.nextInt();
				list1.add(num1);
				break;
			case 2:
				System.out.println("Enter the element");
				int num2=sc.nextInt();
				list2.add(num2);
				break;
			case 3:
				System.out.println("Program ended!!!!!");
				break;
			}
		}while(choice!=3);
		System.out.println(merge(list1,list2));
		
	}

}
