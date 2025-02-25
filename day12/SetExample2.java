package com.celcom.day12;

import java.util.Set;
import java.util.HashSet;
public class SetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		Integer[] a=set.stream().toArray(Integer[]::new);
		for(Integer i:a) {
			System.out.println(i);
		}

	}

}
