package com.lab4.q4_2;

public class SavingsAcc extends Account {

	final double minBal=1000;
	@Override
	public void withdraw(double bal)
	{
		if(minBal>=bal)
		{
			balance+=bal;
		}
		else
		{
			System.out.println("low balance");
		}
	}
	
	
}
