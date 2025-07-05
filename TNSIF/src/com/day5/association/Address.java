package com.day5.association;

public class Address {
	
	private String Street;
	private String city;
	private String State;
	
	
	public Address() {
		super();
	}

	public Address(String street, String city, String state) {
		super();
		Street = street;
		this.city = city;
		State = state;
	}
	
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	

}
