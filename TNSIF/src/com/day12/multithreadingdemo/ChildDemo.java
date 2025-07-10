package com.day12.multithreadingdemo;

public class ChildDemo {
	
	public static void main(String[] args) {
		ChildThread c=new ChildThread(5, "jyoti");
		c.start();
		
		
		Thread.currentThread().setName("Parent name");
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		
		try {
			c.join();
			
		}
		catch(InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println("Thread interrupted"+e.getMessage());
		}
		System.out.println("End of the progarm");
	}

}
