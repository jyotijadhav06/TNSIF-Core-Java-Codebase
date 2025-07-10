package com.day12.multithreadingdemo;

public class ChildThread extends Thread{
	
	int n;
	String msg;
	
	public ChildThread(int n, String msg) {
		super();
		this.n = n;
		this.msg = msg;
	}
	public void run() {
		for(int i=0;i<n;i++) {
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
				System.err.println(e.getMessage());
			}
			System.out.println(i+msg);
		}
	}

}
