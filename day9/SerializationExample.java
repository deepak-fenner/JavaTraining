package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	transient private int eid;
	private String ename;
	private int salary;
	public Employee(int eid, String ename, int salary) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
}
public class SerializationExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee deepak=new Employee(956,"Deepak",2000);
		//Serialization
		FileOutputStream fout=new FileOutputStream("D://ObjectFile.txt");
		ObjectOutputStream objout=new ObjectOutputStream(fout);//converting normal txt file into object storing file
		objout.writeObject(deepak);
		objout.close();
		fout.close();
		System.out.println("Object Saved");
		
		//De-serialization
		FileInputStream fin=new FileInputStream("D://ObjectFile.txt");
		ObjectInputStream objin=new ObjectInputStream(fin);
		Employee e1=(Employee)objin.readObject();
		System.out.println(e1);
		objin.close();
		fin.close();
	}

}
