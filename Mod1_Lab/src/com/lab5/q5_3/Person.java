package com.lab5.q5_3;

import java.util.Random;

public class Person extends Account{

		private String name;
		private float age;
		Random rand = new Random();
		private long accNum = rand.nextLong()+1;
		protected double balance;
		public void withdraw(double bal)
		{
			if(balance>=500 && balance>=bal)
			{
				balance-=bal;
			}
			else
			{
				System.out.println("Insufficient money");
			}
		}
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
}
