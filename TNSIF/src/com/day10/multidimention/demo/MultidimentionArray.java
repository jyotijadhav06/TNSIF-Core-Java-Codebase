package com.day10.multidimention.demo;

class MlArray{
	 static void printArray(int c[][]) {
		 System.out.println("Array of elements are as follows");
		 for(int i=0;i<c.length;i++) {
			 
			 for(int j=0;j<c[i].length;j++) {
				 System.out.print(c[i][j]+" ");
			 }
			 System.out.println();
		 }
	 }
}


public class MultidimentionArray {
	public static void main(String[] args) {
		int c[][]= {{10,20,30},{20,30,40},{50,60},{1,2,3,4,5}};
		System.out.println(c.length);
		MlArray.printArray(c);
	}

}
