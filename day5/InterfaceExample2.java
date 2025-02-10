package com.celcom.day5;

interface AnimalPlan{
	void move();
	void eat();
}
abstract class Animal{
	abstract void move();
	abstract void eat();
}
class Cat implements AnimalPlan{
	public void move() {
		System.out.println("Cat moves by walk");
	}
	public void eat() {
		System.out.println("Cat eats the rat");
	}
}
class Parrot implements AnimalPlan{
	public void move() {
		System.out.println("Parrot moves by flying");
	}
	public void eat() {
		System.out.println("Parrot eats fruits and seeds");
	}
}
class Fish implements  AnimalPlan{
	public void move() {
		System.out.println("Fish moves by swimming");
	}
	public void eat() {
		System.out.println("Fish eats algae");
	}
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		
		Cat cat=new Cat();
		cat.move();
		cat.eat();
		
		Parrot parrot=new Parrot();
		parrot.move();
		parrot.eat();
		
		Fish fish=new Fish();
		fish.move();
		fish.eat();
		
		

	}

}
