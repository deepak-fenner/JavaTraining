package com.celcom.day5;

public class Employee {
	String name;
	String jobtitle;
	double basic;
	
	Employee(String name,String jobtitle,double basic){
		this.name=name;
		this.jobtitle=jobtitle;
		this.basic=basic;
	}
	void displayEmployee() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Job Title: "+jobtitle);
		System.out.println("Employee Basicpay: "+basic);
	}
	 void calculateSalary() {
        double hra = 0.10 * basic;
        double da = 0.08 * basic;
        double grossSalary = basic + hra + da;
        System.out.println("The salary is: "+grossSalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee("Deepak","junior developer",15000);
		employee.displayEmployee();
		//calculate salary
		employee.calculateSalary();
	}

}
