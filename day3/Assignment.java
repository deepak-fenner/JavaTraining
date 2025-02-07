package com.celcom.day3;
import java.util.Scanner;
class Shape{
	int radius;
	int length;
	int breadth;
	int base;
	double height;
	Shape(int radius){
		this.radius=radius;
	}
	Shape(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	Shape(int base,double height){
		this.base=base;
		this.height=height;
	}
	void calculateArea() {
		
	}
}
class Circle extends Shape{
	Circle(int radius){
		super(radius);
	}
	void calculateArea() {
		System.out.println("The Area of Circle is:"+(3.14*radius*radius));
	}
	
}
class Rectangle extends Shape{
	Rectangle(int length,int breadth){
		super(length,breadth);
	}
	void calculateArea() {
		System.out.println("The Area of Rectangle is"+(length*breadth));
	}
	
}
class Triangle extends Shape{
	Triangle(int base,double height){
		super(base,height);
	}
	void calculateArea() {
		System.out.println("The Area of Triangle is:"+(0.5*base*height));
	}
}
public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Shape shape;
		boolean flag=true;
		do {
			System.out.println();
			System.out.println("Enter 1---->Area of Circle:");
			System.out.println("Enter 2---->Area of Rectangle:");
			System.out.println("Enter 3---->Area of Triangle:");
			System.out.println("Enter 4---->Exit:");
			int num=sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("Enter the radius:");
				int radius=sc.nextInt();
				shape=new Circle(radius);
				shape.calculateArea();
				break;
			case 2:
				System.out.println("Enter the length and breadth:");
				int length=sc.nextInt();
				int breadth=sc.nextInt();
				shape=new Rectangle(length,breadth);
				shape.calculateArea();
				break;
			case 3:
				System.out.println("Enter the length and breadth:");
				int base=sc.nextInt();
				double height=sc.nextDouble();
				shape=new Triangle(base,height);
				shape.calculateArea();
				break;
			case 4:
				System.out.println("Program Ended!!!!!!!!");
				flag=false;
				break;
			}
		}
		while(flag==true);
		

	}

}
