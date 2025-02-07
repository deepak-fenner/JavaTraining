package com.celcom.day3;
class Vehicle1{
	void noOfEngine() {
		System.out.println("The Vechile has only one engine");
	}
}
//single inheritance
class TwoWheeler extends Vehicle1{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}
//multilevel inheritance
class Bike extends TwoWheeler{
	void name() {
		System.out.println("My name is Bike");
	}
}
//Hierarchical
class ThreeWheeler extends Vehicle1{
	void noOfWheels() {
		System.out.println("I have three wheels");
	}
}
class Scooty extends TwoWheeler{
	void name() {
		System.out.println("My name is Scooty");
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bikeobject=new Bike();
		bikeobject.noOfWheels();
		bikeobject.noOfEngine();
		bikeobject.name();
		
		ThreeWheeler obj=new ThreeWheeler();
		obj.noOfWheels();
		Scooty scooty=new Scooty();
		scooty.name();

	}

}
