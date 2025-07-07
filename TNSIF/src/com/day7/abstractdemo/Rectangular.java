package com.day7.abstractdemo;

public class Rectangular extends Shape{

	float width;
	float height;
	
	public void Rectagular() {
		width=10.0f;
		height=20.0f;
	}

	public Rectangular(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangular [width=" + width + ", height=" + height + "]";
	}

	@Override
	public void calarea() {
		
		this.area=width*height;
	}
	
}
