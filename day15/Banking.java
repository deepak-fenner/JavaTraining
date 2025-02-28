package com.celcom.day15;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Employee {
	int empId;
	double salary;
	Timestamp time;

	Employee(int empId, double salary, Timestamp time) {
		this.empId = empId;
		this.salary = salary;
		this.time = time;
	}
}

public class Banking {
	static List<Employee> details = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter 1--------->add details of Employee:");
			System.out.println("Enter 2--------->To Sort the values based on condition:");
			System.out.println("Enter 3--------->To display the values after custom sorting");
			System.out.println("Enter 4--------->To Exit");
			System.out.println("Enter a choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the Employee Id:");
				int id = sc.nextInt();
				System.out.println("Enter the Employee Salary:");
				double salary = sc.nextDouble();
				System.out.println("The Current Time is Added suceessfully");
				Timestamp time = new Timestamp(System.currentTimeMillis());
				Employee employee = new Employee(id, salary, time);
				details.add(employee);
				System.out.println("Details added successfully.");
				break;
			case 2:
//				Collections.sort(details,new Comparator<Employee>() {
//					@Override
//					public int compare(Employee e1,Employee e2) {
//						if(e1.salary!=e2.salary) {
//							return Double.compare(e2.salary, e1.salary);
//						}
//						return e1.time.compareTo(e2.time);
//					}
//				});
				Collections.sort(details, (e1, e2) -> {
					if (e1.salary != e2.salary) {
						return Double.compare(e2.salary, e1.salary);
					}
					return e1.time.compareTo(e2.time);
				});
				break;
			case 3:
				System.out.println("The Values are:");
				for (Employee i : details) {
					System.out.println("Employee Id: " + i.empId);
					System.out.println("Employee Salary : " + i.salary);
					System.out.println("TimeStamp: " + i.time);
					System.out.println("------------------");
				}
				break;
			case 4:
				System.out.println("Program ended....");
				break;

			}
		} while (choice != 4);

	}

}
