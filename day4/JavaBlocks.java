package com.celcom.day4;

public class JavaBlocks {
	{
		System.out.println("Instance Block");
	}
	static {
		System.out.println("Static Block");//runs first
	}
	@Override
	public String toString() {
		return "ToString";
	}
	JavaBlocks(){
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaBlocks obj=new JavaBlocks();
		System.out.println("Main Method Block");
		System.out.println(obj);
		
	}

}
