package com.celcom.day7;

public class MultiThreadingExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println(t);
		System.out.println("Current Thread Name: "+t.getName());
		System.out.println("Current Thread Priority: "+t.getPriority());

	}

}
