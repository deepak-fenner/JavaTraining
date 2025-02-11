package com.celcom.day6;

public class ObjectCloningExample implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		ObjectCloningExample obj1=new ObjectCloningExample();
		//object Cloning
		System.out.println(obj1.hashCode());
		ObjectCloningExample obj2=(ObjectCloningExample) obj1.clone();
		System.out.println(obj2.hashCode());

	}

}
