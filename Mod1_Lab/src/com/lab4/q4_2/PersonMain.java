package com.lab4.q4_2;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account sv = new SavingsAcc();
		Account cv = new CurrentAcc();
		cv.setBalance(4000);
		sv.setBalance(5000);
		sv.withdraw(4000);
		System.out.println(sv.getAccNum()+"\n"+sv.getBalance());
		System.out.println("------------------------------");
		System.out.println(cv.getAccNum()+"\n"+cv.getBalance());
		cv.withdraw(6000);
	}

}
