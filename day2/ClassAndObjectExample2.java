package com.celcom.day2;


class Fruits{
	String name;
	String color;
	int size;
	int price;
	Fruits(String name,String color,int size,int price){
		this.name=name;
		this.color=color;
		this.size=size;
		this.price=price;
	}
	void display() {
		System.out.println("Fruit name: "+name);
		System.out.println("Fruit color: "+color);
		System.out.println("Fruit size: "+size);
		System.out.println("Fruit price: "+price);
	}
	void setPrice(int price) {
		this.price=price;
	}
}
public class ClassAndObjectExample2 {

	public static void main(String[] args) {
		Fruits fruit=new Fruits("Apple","red",20,100);
		fruit.display();
		fruit.setPrice(200);
		fruit.display();

	}

}
