package com.celcom.day13;

public class CustomerDAO {
	private String name;
	private String dob;
	private String address;
	private String fatherName;
	private long aadharNumber;
	private long phoneNumber;
	CustomerDAO(String name,String dob,String address,String fatherName,long aadharNumber,long phoneNumber){
		this.name=name;
		this.dob=dob;
		this.address=address;
		this.fatherName=fatherName;
		this.aadharNumber=aadharNumber;
		this.phoneNumber=phoneNumber;
	}
	public String getName() {
		return name;
	}
	public String getDob() {
		return dob;
	}
	public String getAddress() {
		return address;
	}
	public String getFatherName() {
		return fatherName;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
}
