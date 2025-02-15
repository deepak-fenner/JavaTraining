 package com.celcom.day7;
//Interface for Anonymous Inner Class
interface MyInterface{
	void display();
}
public class InnerClassExample{
	//1.Non-Static Class
	class InnerClass1{
		void myMethod1() {
			System.out.println("Non-Static Inner Class");
		}
	}
	//2.Static Class
	static class InnerClass2{
		void myMethod1() {
			System.out.println("Static Inner Class");		}
	}
	//3.local Inner Class
	void myMethod() {
		class InnerClass3{
			void myMethod3() {
				System.out.println("Local Inner Class");
			}
		}
		InnerClass3 inner3=new InnerClass3();
		inner3.myMethod3();
	}
	void display() {
		System.out.println("Anonymous Inner Class");
	}
	public static void main(String[] args) {
		InnerClassExample obj1=new InnerClassExample();
		InnerClass1 inner1=obj1.new InnerClass1();
		inner1.myMethod1();
		
		InnerClassExample.InnerClass2 inner2=new InnerClassExample.InnerClass2();
		inner2.myMethod1();
		
		InnerClassExample obj2=new InnerClassExample();
		obj2.myMethod();
		//Anonymous Inner Class
		MyInterface obj3=new MyInterface() {
			public void display() {
				System.out.println("Anonymous Inner Class");
			}
		};
		
		obj3.display();
		
		
		//Lambda Expression
		MyInterface obj4=()->System.out.println("Lambda Expression");
		obj4.display();
		
	}

}
