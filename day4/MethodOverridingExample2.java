package com.celcom.day4;

class Animal{
	void move() {
		System.out.println("Cannot Define");
	}
	void eat() {
		System.out.println("Cannot Define");
	}
}
class Cat extends Animal{
	void move() {
		System.out.println("Cat moves by walk");
	}
	void eat() {
		System.out.println("Cat eats the rat");
	}
}
class Parrot extends Animal{
	void move() {
		System.out.println("Parrot moves by flying");
	}
	void eat() {
		System.out.println("Parrot eats fruits and seeds");
	}
}
class Fish extends Animal{
	void move() {
		System.out.println("Fish moves by swimming");
	}
	void eat() {
		System.out.println("Fish eats algae");
	}
}
public class MethodOverridingExample2 {

	public static void main(String[] args) {
		// Dynamic method Dispatch
		Animal animalobject;//Super class reference
		//cat object
		animalobject=new Cat();
		animalobject.move();
		animalobject.eat();
		//parrot object
		animalobject=new Parrot();
		animalobject.move();
		animalobject.eat();
		//fish object
		animalobject=new Fish();
		animalobject.move();
		animalobject.eat();

	}

}
