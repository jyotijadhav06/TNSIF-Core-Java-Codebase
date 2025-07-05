package com.day6.staticdemo;

public class MyClass {
	
	private int section;
	private static int srno;
	
	static{
		System.out.println("within static block");
		srno=100;
		//section=10;
	}
	
	public MyClass(){
		System.out.println("within default constructor");
		srno=101;
		section++;
	}

	@Override
	public String toString() {
		return "MyClass [section=" + section + "srno=" + srno + "]";
	}

	void display() {
		//System.out.println(section);
		System.out.println("Serial no: "+srno);
	}
}
