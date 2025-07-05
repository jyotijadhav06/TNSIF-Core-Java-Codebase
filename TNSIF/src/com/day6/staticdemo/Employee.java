package com.day6.staticdemo;

public class Employee {
	
	private int id;
	private String name;
	static String CompanyName="TNSIF";
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", companyName=" + CompanyName + "]";
	}

	
	
}
