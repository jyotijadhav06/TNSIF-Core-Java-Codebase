package com.day7.interfacedemo;

public class SavingAccount extends Customer implements Bank{
	
	private long accno;
	private float balance;
	
	public SavingAccount(String name, String city, long accno, float balance) {
		super(name, city);
		this.accno = accno;
		this.balance = balance;
	}
	
	public long getAccno() {
		return accno;
	}

	public void setAccno(long accno) {
		this.accno = accno;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public void deposit(float amount) {
		
		if(amount<0||amount>deposit_limit) {
			System.out.println("Please deposit valid amount");
		}
		else {
			balance+=amount;
			System.out.println("Rs"+amount+"is deposited successfully");
		}
	}
	@Override
	public void withdraw(float amount) {
		
		if(amount<=balance-minbal) {
			balance-=amount;
			System.out.println("Rs"+amount+" withdraw successfully");
		}
		else {
			System.out.println("Insufficient balance");
		}
	}

	@Override
	public String toString() {
		return "SavingAccount [accno=" + accno + ", balance=" + balance + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
	
}
