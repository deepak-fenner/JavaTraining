package com.celcom.day2;

public class InstanceVsStatic {
	int a=10;
	static int b=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVsStatic obj1=new InstanceVsStatic();
		InstanceVsStatic obj2=new InstanceVsStatic();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		//After Changes
		obj1.a=20;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		//static variable
		InstanceVsStatic obj3=new InstanceVsStatic();
		InstanceVsStatic obj4=new InstanceVsStatic();
		System.out.println(obj3.b);
		System.out.println(obj4.b);
		obj3.b=20;
		//after changes
		System.out.println(obj3.b);
		System.out.println(obj4.b);
	}

}
