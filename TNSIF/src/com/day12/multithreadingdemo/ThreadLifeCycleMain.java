package com.day12.multithreadingdemo;

public class ThreadLifeCycleMain {
	
	public static void main(String[] args) {
		Thread t=new ThreadLifeCycleDemo();
		System.out.println("Before runnable state thread is alive or not:"+t.isAlive());
		t.start();
		
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("After completion execution, it is alive or not"+t.isAlive());
	}
	

}
