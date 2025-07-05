package com.day5.singleinheritance;

public class citizen {
	
	private String name;
	private long phoneno;
	private String address;
	
	
	public citizen() {
		System.out.println("citizen object created");
	}
	
	public citizen(String name, long phoneno, String address) {
		super();
		this.name = name;
		this.phoneno = phoneno;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "citizen [name=" + name + ", phoneno=" + phoneno + ", address=" + address + "]";
	}

}
