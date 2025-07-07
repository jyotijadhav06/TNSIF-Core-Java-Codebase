package com.day7.overriding;

public class SBI extends RBI{

	public float getRateofInterest() {
		System.out.println("Child class");
		return 6.10f;
	}
	
}
