package com.celcom.day5;
//Abstract Class
abstract class Vehicle{
	void noOfEngine() {
		System.out.println("I have one Engine.");
	}
	abstract void noOfWheels();
	abstract void brandName();
}
class Car extends Vehicle{
	void noOfWheels() {
		System.out.println("Car has four Wheels.");
	}
	void brandName() {
		System.out.println("The Brand of the car is Hyundai");
	}
}
public class AbstractClassExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car=new Car();
		car.noOfWheels();
		car.brandName();
		car.noOfEngine();

	}

}
