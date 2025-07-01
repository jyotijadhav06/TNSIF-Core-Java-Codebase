package com.jumpstatement;

public class SwitchStatement {

	public static void main(String[] args) {
		
		int userInput=0;
		switch(userInput) {
		
		case 1:
			System.out.println("current racharge detail");
			break;
		case 2:
			System.out.println("Current recharge expiry");
			break;
		case 3:
			System.out.println("new offers");
			break;
		case 4:
			System.out.println("Talk to our customer support person");
			break;
		default:
			System.out.println(userInput+" is not a valid input given by you");
		}
	}
}
