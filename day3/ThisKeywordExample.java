package com.celcom.day3;

public class ThisKeywordExample {
	String name;
	ThisKeywordExample(){
		this("deepak");
	}
	ThisKeywordExample(String name){
		this.name=name;
		this.greeting();
	}
	void greeting() {
		System.out.println("My name is: "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordExample obj=new ThisKeywordExample();
	}

}
