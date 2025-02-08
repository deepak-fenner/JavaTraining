package com.celcom.day5;

public class Person {
	String name;
	int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	void displayDetails() {
		System.out.println("The Person name is"+name);
		System.out.println("The Person age is"+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1=new Person("Kumar",23);
		Person person2=new Person("Ramesh",27);
		person1.displayDetails();
		person2.displayDetails();
	}

}
