package com.day11.finallyblock;

public class greatervalueException extends Exception {
		
	public greatervalueException(String string) {
		super(string);
	}
	public greatervalueException() {
		super("percentage should not be more than 100");
	}
}
