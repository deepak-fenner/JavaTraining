package com.celcom.day3;

class Employee{
	private int eid;
	private String name;
	private int salary;
	public Employee(){
		
	}
	public Employee(int eid, String name, int salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
public class GetterAndSetterExample {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setEid(1234);
		e1.setName("Deepak");
		e1.setSalary(15000);
		System.out.println("Employee Id: "+e1.getEid());
		System.out.println("Employee Name: "+e1.getName());
		System.out.println("Employee Salary: "+e1.getSalary());

	}

}
