package com.celcom.saturday_assignment_8th_Feb_2025;

class Animal{
	void makeSound() {
		System.out.println("Different animals make different Sounds.");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Cat makes meow sound");
	}
}
public class InheritanceExmple1{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat=new Cat();
		cat.makeSound();
	}

}
