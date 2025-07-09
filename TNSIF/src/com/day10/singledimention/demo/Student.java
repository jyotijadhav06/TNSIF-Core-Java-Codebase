package com.day10.singledimention.demo;

public class Student {
	
	private int rollno;
	private String Name;
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		Name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	

}
