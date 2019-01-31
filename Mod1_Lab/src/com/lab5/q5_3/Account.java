package com.lab5.q5_3;

import java.util.Random;

public abstract class Account {

		Random rand = new Random();
		private long accNum = rand.nextLong()+1;
		private double balance;
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
		public abstract void withdraw(double bal);
		public double getBalance1()
		{
			return balance;
		}
		@Override
		public String toString() {
			return "Account no=" + accNum + ", balance=" + balance ;
		}
		
		

}