package com.celcom.day1;
import java.util.Scanner;
public class UserInputExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id,name and salary");
		int eid=sc.nextInt();
		String name=sc.next();
		Double salary=sc.nextDouble();
		System.out.println("Employee id:"+eid);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+salary);

	}

}
