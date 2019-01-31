package com.lab6.q6_2;

import java.util.Random;

public class Account {

	Random rand = new Random();
	private String name;
	private float age;
	private long accNum = rand.nextInt(999999)+1;
	protected double balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
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
