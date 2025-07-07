package com.day7.abstractdemo;

public abstract class Shape {
	protected float area;
	public abstract void calarea();
	
	public void show() {
		System.out.println("Area of shape: "+area);
	} 

}
