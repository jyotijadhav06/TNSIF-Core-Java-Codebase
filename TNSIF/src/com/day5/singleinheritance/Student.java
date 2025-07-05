package com.day5.singleinheritance;
//child class
public class Student extends citizen{
	
	private int rollno;
	private String clgname;
	
	public Student() {
		super();
	}
	
	public Student(String name, long phoneno, String address,int rollno,String clgname) {
		super(name, phoneno, address);
		this.rollno = rollno;
		this.clgname = clgname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getClgname() {
		return clgname;
	}

	public void setClgname(String clgname) {
		this.clgname = clgname;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", clgname=" + clgname + ", getName()=" + getName() + ", getPhoneno()="
				+ getPhoneno() + ", getAddress()=" + getAddress() + "]";
	}
	
	

}
