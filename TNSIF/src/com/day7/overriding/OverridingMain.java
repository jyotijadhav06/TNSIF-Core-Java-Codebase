package com.day7.overriding;

public class OverridingMain {
	
	public static void main(String[] args) {
		RBI rbi=new RBI();
		System.out.println(rbi.getRateofInterest());
		//dynamic binding
		rbi=new SBI();
		System.out.println(rbi.getRateofInterest());
		rbi=new ICICI();
		System.out.println(rbi.getRateofInterest());

	}
}
