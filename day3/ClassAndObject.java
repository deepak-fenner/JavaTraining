package com.celcom.day3;


class Vehicle{
	String name;
	String type;
	double price;
	Vehicle(String name,String type,double price){
		this.name=name;
		this.type=type;
		this.price=price;
	}
	Vehicle(String name,String type){
		this.name=name;
		this.type=type;
	}
	void display() {
		System.out.println("The name of the vechile is "+name);
		System.out.println("The type of the vechile is "+type);
		System.out.println("The price of the vechile is "+price);
	}
	void display1() {
		System.out.println("The name of the vechile is "+name);
		System.out.println("The type of the vechile is "+type);
	}
}
public class ClassAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle bike=new Vehicle("Bike","two-wheeler",120000.34);
		bike.display();
		Vehicle bus=new Vehicle("Bus","public-transport");
		bus.display1();
				

	}

}
