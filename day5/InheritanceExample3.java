package com.celcom.day5;

class Shape{
	int width;
	int height;
	Shape(int width,int height){
		this.width=width;
		this.height=height;
	}
	void getArea() {
		
	}
}
class Rectangle1 extends Shape{
	Rectangle1(){
		super(12, 12);
	}
	void getArea() {
		System.out.println("The Area of Rectangle is: "+(width*height));
	}
}
public class InheritanceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 rectangle=new Rectangle1();
		rectangle.getArea();
	}

}
