package com.celcom.day5;
import java.util.Scanner;

interface Area{
	void calculateArea();
}
interface Perimeter{
	void calculatePerimeter();
}
abstract class Shape implements Area,Perimeter{
	int radius;
	int length;
	int breadth;
	int base;
	double height;
	int side;
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
	Shape(int base,double height,int side){
		this.base=base;
		this.height=height;
		this.side=side;
	}
	public abstract void calculateArea();
	public abstract void calculatePerimeter();
}
class Circle extends Shape{
	Circle(int radius){
		super(radius);
	}
	public void calculateArea() {
		System.out.println("The Area of Circle is:"+(3.14*radius*radius));
	}
	public void calculatePerimeter() {
		System.out.println("The Perimeter of Circle is:"+(2*3.14*radius));
	}
	
}
class Rectangle extends Shape{
	Rectangle(int length,int breadth){
		super(length,breadth);
	}
	public void calculateArea() {
		System.out.println("The Area of Rectangle is: "+(length*breadth));
	}
	public void calculatePerimeter() {
		System.out.println("The Perimeter of Rectangle is: "+(2*(length+breadth)));
	}
	
}
class Triangle extends Shape{
	Triangle(int base,double height){
		super(base,height);
	}
	Triangle(int base,double height,int side){
		super(base,height,side);
	}
	public void calculateArea() {
		System.out.println("The Area of Triangle is:"+(0.5*base*height));
	}
	public void calculatePerimeter() {
		System.out.println("The Perimeter of Triangle is:"+(base+height+side));
	}
}
public class InterfaceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Shape shape;
		boolean flag=true;
		do {
			System.out.println();
			System.out.println("Enter 1---->Area and Perimeter of Circle:");
			System.out.println("Enter 2---->Area and Perimeter of Rectangle:");
			System.out.println("Enter 3---->Area and Perimeter of Triangle:");
			System.out.println("Enter 4---->Exit:");
			int num=sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("Enter the radius:");
				int radius=sc.nextInt();
				shape=new Circle(radius);
				shape.calculateArea();
				shape.calculatePerimeter();
				break;
			case 2:
				System.out.println("Enter the length and breadth:");
				int length=sc.nextInt();
				int breadth=sc.nextInt();
				shape=new Rectangle(length,breadth);
				shape.calculateArea();
				shape.calculatePerimeter();
				break;
			case 3:
				System.out.println("Enter the length ,breadth and side:");
				int base=sc.nextInt();
				double height=sc.nextDouble();
				int side=sc.nextInt();
				shape=new Triangle(base,height);
				shape.calculateArea();
				shape=new Triangle(base,height,side);
				shape.calculatePerimeter();
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
