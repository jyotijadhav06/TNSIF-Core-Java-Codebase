package com.day3.scanner;

public class Person {
	
	private int income;
	private String name;
	private String gender;
	private int age;
	private long MobileNumber;
	private int Tax;
	
	public int getIncome(){
		return income;
	}
	public void setIncome(int income) {
		this.income=income;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public int getTax() {
		return Tax;
	}
	public void setTax(int tax) {
		Tax = tax;
	}
	
	@Override
	public String toString() {
		return "Person [income=" + income + ", name=" + name + ", gender=" + gender + ", age=" + age + ", MobileNumber="
				+ MobileNumber + ", Tax=" + Tax + "]";
	}
	
	
	

}
