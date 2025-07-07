package com.day7.interfacedemo;

public interface Bank {
	
	final static float minbal=5000;
	final static float deposit_limit=10000;
	
	public void deposit(float amount);
	public void withdraw(float amount); 
}
