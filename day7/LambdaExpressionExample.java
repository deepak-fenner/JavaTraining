package com.celcom.day7;

interface Calculator{
	int calculate(int a,int b);
}
public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=(a,b)->a+b;
		System.out.println("Addition: "+c.calculate(10, 20));
		
		c=(a,b)->a-b;
		System.out.println("Subtraction: "+c.calculate(30, 20));
		

	}

}
