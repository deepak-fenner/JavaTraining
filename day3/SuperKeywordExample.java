package com.celcom.day3;

class Vehicle2{
	String name="I am a super class variable";
	Vehicle2(){
		System.out.println("I am the super class constructor");
	}
	void noOfEngine() {
		System.out.println("I have a single engine");
	}
}
class TwoWheeler1 extends Vehicle2{
	TwoWheeler1(){
		super();//super class constructor call
	}
	void noOfWheels() {
		super.noOfEngine();//super class method
		System.out.println("I have 2 wheels");
		System.out.println(super.name);//super class variable
	}
}
public class SuperKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler1 bike=new TwoWheeler1();
		bike.noOfWheels();

	}

}
