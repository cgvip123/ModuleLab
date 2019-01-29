package com.lab2.q2_5;

import com.lab2.q2_5.Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender = args[0].charAt(0);	
		Person p = new Person("Divya","kulshresth",gender);
		if(gender=='M')
			p.setGender(Gender.M);
		else if(gender=='F')
			p.setGender(Gender.F);
		System.out.println(p.display());
		System.out.println(p.getGender().getCode());
		
	}

}
