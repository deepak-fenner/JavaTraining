package com.celcom.saturday_assignment_8th_Feb_2025;

class Vechile{
	void drive() {
		
	}
}
class Car extends Vechile{
	void drive() {
		System.out.println("Repairing a car");
	}
}
public class InheritanceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.drive();

	}

}
