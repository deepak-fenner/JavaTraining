package com.celcom.day9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		
		for(Integer i:list) {
			System.out.println(i);
		}
		//list traversing
		System.out.println();
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
//		list.stream().forEach(System.out::println);//method reference
//		
//		list.stream().forEach(i->System.out.println(i));
//		
//		list.parallelStream().forEach(i->System.out.println(i));
		
		System.out.println();
		
		list.add(1,15);
		System.out.println(list);
		
		System.out.println();
		
		list.set(3,10);
		System.out.println(list);
		
		System.out.println();
		
		list.remove(Integer.valueOf(10));
		
		System.out.println(list);
		
		System.out.println("Size of the list: "+list.size());
		
		System.out.println("Whether List contains 20?: "+list.contains(20));
		
		System.out.println("Checking whether list is empty or not?: "+list.isEmpty());
		
		//to filter even numbers
		System.out.println("Even Elements in the list:");
		list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		
		//traversing using iterator interface
	
		Iterator<Integer> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		ListIterator<Integer> iterator1=list.listIterator();
		//forward traversing
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		
		//backward traversing
		
		while(iterator1.hasPrevious()) {
			System.out.println(iterator1.previous()); 
		}

	}

}
