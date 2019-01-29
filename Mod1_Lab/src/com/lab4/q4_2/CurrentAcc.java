package com.lab4.q4_2;

public class CurrentAcc extends Account {

		private double overDraft = -1000;
		
		@Override
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
