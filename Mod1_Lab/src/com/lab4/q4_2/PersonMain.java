package com.lab4.q4_2;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.setName("smith");
		p.setAge(23);
		p.setBalance(2000);
		Person p1 = new Person();
		p1.setName("kathy");
		p1.setAge(25);
		p1.setBalance(3000);
		System.out.println(p.getName()+"\n"+p.getAccNum()+"\n"+p.getAge()+"\n"+p.getBalance());
		System.out.println("--------------------------------");
		System.out.println(p1.getName()+"\n"+p1.getAccNum()+"\n"+p1.getAge()+"\n"+p1.getBalance());
		p.deposit(2000);
		p1.withdraw(2000);
		System.out.println("--------------------------------");
		System.out.println(p.getName()+"\n"+p.getAccNum()+"\n"+p.getAge()+"\n"+p.getBalance());
		System.out.println("--------------------------------");
		System.out.println(p1.getName()+"\n"+p1.getAccNum()+"\n"+p1.getAge()+"\n"+p1.getBalance());
	}

}
