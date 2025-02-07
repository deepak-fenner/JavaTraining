package com.celcom.day2;


class Employee{
	int eid;
	String name;
	double salary;
	Employee(int eid,String name,double salary){
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	void display() {
		System.out.println("Employee Id: "+eid);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
		
	}
}
public class ClassAndObjectExample1 {

	public static void main(String[] args) {
		Employee employee=new Employee(1234,"Hello",1500.80);
		employee.display();
		Employee employee1=new Employee(4567,"World",2000.40);
		employee1.display();

	}

}
