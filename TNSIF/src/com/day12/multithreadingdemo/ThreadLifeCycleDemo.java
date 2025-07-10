package com.day12.multithreadingdemo;

public class ThreadLifeCycleDemo extends Thread{
	 
	public void run() {
		
		System.out.println("inside run() is alive or not"+isAlive());
		int num=0;
		while(num<4) {
			num++;
			System.out.println("Num: "+num);
		}
		try {
			sleep(500);
			System.out.println("in not runnable state, is alive or not"+isAlive());
		}
		catch(InterruptedException e) {
			System.err.println("thread interrupted: "+e.getMessage());
		}
	}
}
