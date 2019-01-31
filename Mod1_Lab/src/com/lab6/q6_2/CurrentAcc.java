package com.lab6.q6_2;

public class CurrentAcc extends Account {

		private double overDraft = -1000;
		
		public void withdraw(double bal)
		{
			if(balance-bal>=overDraft)
			{
				balance -= bal;
			}
			else
			{
				System.out.println("you reached overdraft limit");
				System.out.println("you can withdraw only:"+(balance-overDraft));
			}
		}
}
