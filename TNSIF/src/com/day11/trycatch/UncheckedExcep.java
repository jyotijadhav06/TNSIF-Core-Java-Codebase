package com.day11.trycatch;

public class UncheckedExcep {
	
	public static void main(String[] args) {
		int x[];
		try {
			x=new int[] {10,20,30,40};
			System.out.println(x[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Specified index does not exist"+e.getMessage());
		}
	}

}
