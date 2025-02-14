package com.celcom.day9;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer>vector=new Vector<>(3,2);//first argument---->Initial capacity second argument---> incrementing capacity
		System.out.println(vector.size());//0
		System.out.println(vector.capacity());//3
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		
		System.out.println(vector.size());//3
		System.out.println(vector.capacity());//3
		
		vector.add(40);
		System.out.println(vector.size());//4
		System.out.println(vector.capacity());//5
		
		//traversing Vector method1
		for(int i=0;i<vector.size();i++) {
			System.out.println(i);
		}
		
		//traversing vector method2
		for(Integer i:vector) {
			System.out.println(i);
		}
		
		//Using Enumeration for traversal
		Enumeration<Integer> enumerate=vector.elements();
		while(enumerate.hasMoreElements()) {
			System.out.println(enumerate.nextElement());
		}
		
		
		
		

	}

}
