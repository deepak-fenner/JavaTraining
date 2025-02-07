package com.celcom.day4;

class SuperClass{
	void myMethod() {
		System.out.println("I am from Super Class");
	}
}
class SubClass extends SuperClass{
	void myMethod() {
		System.out.println("I am from Sub Class");
	}
}
public class MethodOverridingExample1 {

	public static void main(String[] args) {
		SubClass subclass=new SubClass();
		subclass.myMethod();
		SuperClass superclass=new SuperClass();
		superclass.myMethod();
		//Dynamic Method Dispatch
		SuperClass superclass1=new SubClass();
		superclass1.myMethod();

	}

}
