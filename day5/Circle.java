package com.celcom.day5;

public class Circle {
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	void setRadius(double radius) {
		this.radius=radius;
	}
	double getRadius() {
		return radius;
	}
	double calculateArea() {
		return (3.14*radius*radius);
	}
	double calculatePerimeter() {
		return (2*3.14*radius);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle(24);
		System.out.println("The Radius is: "+circle.getRadius());
		System.out.println("The Area is: "+circle.calculateArea());
		System.out.println("The Perimeter is: "+circle.calculatePerimeter());
		circle.setRadius(20);
		System.out.println("The Radius is: "+circle.getRadius());
		System.out.println("The Area is: "+circle.calculateArea());
		System.out.println("The Perimeter is: "+circle.calculatePerimeter());
	}

}
