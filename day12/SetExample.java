package com.celcom.day12;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class SetExample {

	public static void main(String[] args) {
		
		Set<String> hashset1 = new TreeSet<>();
		hashset1.add("apple");
		hashset1.add("lemon");
		hashset1.add("guava");
		hashset1.add("apple");
		System.out.println("hashset 1 "+hashset1);
		Set<String> hashset2 = new TreeSet<>();
		hashset2.add("apple");
		hashset2.add("melon");
		hashset2.add("watermelon");
		hashset2.add("lemon");
		System.out.println("hashset 2 "+hashset2);
		//hashset1.addAll(hashset2);
		//System.out.println("After merging :"+hashset1);
		hashset1.retainAll(hashset2);
		System.out.println("retainsAll : "+hashset1);
		Iterator<String> i = hashset2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Object arr[] = hashset2.toArray();
		System.out.println("to array : ");
		for(Object element :  arr) {
			System.out.print(element+" ");
		}
	}

}
