package com.day4.access.specifier;

public class Base {
	
	int var1=10;
	public int var2=20;
	private int var3=30;
	protected int var4=40;
	
	void default1() {
		System.out.println("Default variable: "+var1);
	} 
	public void public1() {
		System.out.println("Public variable: "+var2);
	} 
	private void private1() {
		System.out.println("Private variable: "+var3);
	}
	protected void protected1() {
		System.out.println("Protected variable: "+var4);
	}
}
