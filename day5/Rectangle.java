package com.celcom.day5;

public class Rectangle {
	int width;
	int height;
	Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	int getArea() {
		return width*height;
	}
	int getPerimeter() {
		return 2*(width+height);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle1=new Rectangle(2,4);
		System.out.println("The Area of Rectangle is: "+rectangle1.getArea());
		System.out.println("The perimeter of Rectangle is: "+rectangle1.getPerimeter());

	}

}
