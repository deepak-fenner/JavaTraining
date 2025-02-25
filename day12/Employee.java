package com.celcom.day12;

public class Employee {
	private int empId;
	private String name;
	private int age;
	private String email;
	private String address;
	Employee(int empId,String name,int age,String email,String address){
		this.empId=empId;
		this.name=name;
		this.age=age;
		this.email=email;
		this.address=address;
	}
	Employee(String name,int age,String email,String address){
		this.name=name;
		this.age=age;
		this.email=email;
		this.address=address;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
}
