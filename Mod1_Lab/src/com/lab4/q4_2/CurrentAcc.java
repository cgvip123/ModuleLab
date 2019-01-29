package com.lab4.q4_2;

public class CurrentAcc extends Account {

		private double overDraft;
		
		@Override
		public void withdraw(double bal)
		{
			if(overDraft>8000)
			{
				return true;
			}
			else
			{
				return;
			}
		}
}
