package com.day5.hirarchicalinheritance;

public class Person {
	
    private String city;
    private String name;

    public Person() {
    	System.out.println("person call default value");
    	name="jyoti";
    	city="pune";
    }

    
	public Person(String city, String name) {
		super();
		this.city = city;
		this.name = name;
	}


	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
    
}
