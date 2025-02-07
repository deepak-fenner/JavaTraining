package com.celcom.day4;

class Vehicle{
	void engine() {
		System.out.println("All vehicle has an engine");
	}
	void wheels() {
		System.out.println("All vehicle has a wheels");
	}
}

class Wheels{
	void wheelModel() {
		System.out.println("Wheel Model is MRF");
	}
	void noOfWheels(String vehicleType) {
		if(vehicleType.equals("Two Wheeler")) {
			System.out.println("I have Two wheeler.");
		}
		else if(vehicleType.equals("Four Wheeler")) {
			System.out.println("I have Four wheeler.");
		}
	}
}
class Engine{
	void EngineModel() {
		System.out.println("Engine Model is honda");
	}
}

class Car extends Vehicle{//IS-A Relationship
	Wheels wheel=new Wheels();//HAS-A Relationship
	Engine engine=new Engine();//HAS-A Relationship
	void engineModel() {
		engine.EngineModel();
	}
	void wheelModel() {
		wheel.wheelModel();
	}
	void noOfWheels() {
		wheel.noOfWheels("Two Wheeler");
	}
}
public class RelationshipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car=new Car();
		car.engine();
		car.wheels();
		car.engineModel();
		car.wheelModel();
		car.noOfWheels();

	}

}
