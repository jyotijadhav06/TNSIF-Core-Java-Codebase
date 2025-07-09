package com.day11.finallyblock;

public class Nestedtrycatch {
	
	public static void check() {
		String str="TNSIF";
		int slength= str.length();
		System.out.println("Length of the String : "+slength);
		
		String anotherString=null;
		int y=6;
		
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("String length: "+anotherString);
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
