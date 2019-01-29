package com.lab2.q2_3;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Divya","kulshresth",'F');
		
		System.out.println("Person Details:");
		System.out.println("---------------------");
		System.out.println("First Name:"+p.getFirstName());
		System.out.println("Last Name:"+p.getLastName());
		System.out.println("gender:"+p.getGender());
	}

}
