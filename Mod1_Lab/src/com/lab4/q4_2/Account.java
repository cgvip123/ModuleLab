package com.lab4.q4_2;

import java.util.Random;

public class Account {

	Random rand = new Random();
	private long accNum = rand.nextInt(999999)+1;
	protected double balance;
	public long getAccNum() {
		return accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double bal)
	{
			balance+=bal;
	}
	public void withdraw(double bal)
	{
			balance-=bal;
	}
}
