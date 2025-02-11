package com.celcom.day6;

public class GarbageCollectionExample1 {
	static int count;
	GarbageCollectionExample1(){
		count++;
		System.out.println(count);
	}
	@Override
	protected void finalize() {
		count--;
		System.out.println(count);
	}
	public static void main(String[] args) {
		GarbageCollectionExample1 obj1=new GarbageCollectionExample1();
		GarbageCollectionExample1 obj2=new GarbageCollectionExample1();
		obj1=null;
		System.gc();//requests jvm for  garbage Collection
		obj2=null;
		Runtime.getRuntime().gc();

	}

}
