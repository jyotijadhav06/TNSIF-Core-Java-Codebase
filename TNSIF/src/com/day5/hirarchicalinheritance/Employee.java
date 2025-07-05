package com.day5.hirarchicalinheritance;

public class Employee extends Person{

	private int empid;
	private String dept;
	private String salary;
	
	public Employee() {
		empid=101;
		dept="computer";
		salary="20000f";
	}

	public Employee(int empid, String dept, String salary,String city, String name) {
		super();
		this.empid = empid;
		this.dept = dept;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", dept=" + dept + ", salary=" + salary + ", getCity()=" + getCity()
				+ ", getName()=" + getName() + "]";
	}
	
	
}
