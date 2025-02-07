package com.celcom.day3;

public class ThisKeywordExample1 {
	
	ThisKeywordExample1(){
		this("A");
		System.out.println("A");
	}
	ThisKeywordExample1(String name){
		this(10);
		System.out.println("B");
		
	}
	ThisKeywordExample1(int number){
		System.out.println("C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordExample1 obj=new ThisKeywordExample1();
	}
	 

}
