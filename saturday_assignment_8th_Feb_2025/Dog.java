package com.celcom.saturday_assignment_8th_Feb_2025;

public class Dog {
	String name;
	String breed;
	Dog(String name,String breed){
		this.name=name;
		this.breed=breed;
	}
	void setName(String name) {
		this.name=name;
	}
	void setBreed(String breed) {
		this.breed=breed;
	}
	void display() {
		System.out.println("The Name of the dog is "+name);
		System.out.println("The breed of the dog is "+breed);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dogobject=new Dog("Jimmy","Labrador");
		Dog dogobject1=new Dog("Shero","German Shephard");
		dogobject.display();
		dogobject1.display();
		//setting name
		dogobject.setName("Fluffy");
		dogobject.setBreed("rotweiler");
		dogobject.display();
		

	}

}
