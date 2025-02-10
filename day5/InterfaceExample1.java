package com.celcom.day5;

interface VehiclePlan1{
	void noOfEngine();
	
}
interface VehiclePlan2{
	void noOfWheels();
	void brandName();
}
class Car1 implements VehiclePlan1,VehiclePlan2{
	public void noOfEngine() {
		System.out.println("I have only one engine");
	}
	public void noOfWheels() {
		System.out.println("Car is Four Wheeler");
	}
	public void brandName() {
		System.out.println("Car brand name is suzuki");
	}
}
class Car2 extends Car1{
	public void noOfEngine() {
		System.out.println("I have only one engine");
	}
	public void noOfWheels() {
		System.out.println("Car is eight Wheeler");
	}
	public void brandName() {
		System.out.println("Car brand name is Hyundai");
	}
}
public class InterfaceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 obj=new Car1();
		obj.brandName();
		obj.noOfEngine();
		obj.noOfWheels();
	}

}
