package com.day5.hirarchicalinheritance;

public class Student extends Person{

	private String Per_class;
	private float percentage;
	
	public Student() {
		System.out.println("Student call default constructor");
		Per_class="TE";
		percentage=85.21f;
	}

	public Student(String per_class, float percentage,String city, String name) {
		super(city, name);
		this.Per_class = per_class;
		this.percentage = percentage;
	}
	
	public String getPer_class() {
		return Per_class;
	}

	public void setPer_class(String per_class) {
		Per_class = per_class;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [Per_class=" + Per_class + ", percentage=" + percentage + ", getCity()=" + getCity()
				+ ", getName()=" + getName() + "]";
	}
	
	
	
	
}
