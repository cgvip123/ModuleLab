package com.lab6.q6_2;

public class PersonMain {

		public static void validate(Account a) throws NotValidAgeException
		{
			if(a.getAge()<15)
			{
				 throw new NotValidAgeException("age should be more than 12");
			}
			else
			{
				System.out.println("continue");
			}
		}
	public static void main(String[] args) {
		Account a = new Account();
		Account sv = new SavingsAcc();
		Account cv = new CurrentAcc();
		a.setName("smith");
		a.setAge(45);
		try {
			validate(a);
		}
		catch(Exception e)
		{
			System.out.println("Exception occur:"+e);
		}
		cv.setBalance(4000);
		sv.setBalance(4000);
		sv.withdraw(2000);
		System.out.println(a.getName()+"\n"+a.getAge()+"\n"+sv.getAccNum()+"\n"+sv.getBalance());
		System.out.println("------------------------------");
		System.out.println(cv.getAccNum()+"\n"+cv.getBalance());
		cv.withdraw(3500);
	}

}
