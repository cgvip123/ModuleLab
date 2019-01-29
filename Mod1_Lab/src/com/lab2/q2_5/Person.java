package com.lab2.q2_5;

enum Gender{
	M(10),F(20);
	
	private int code;
	
	Gender(int code)
	{
		this.code = code;
	}
	
	public int getCode()
	{
		return code;
	}
}

public class Person {
	
	String firstName;
	String lastName;
	Gender gender;
	
	public Person(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String display()
	{
		return "Person Details: \n -----------------"+"\n"+
				"First Name:"+firstName+"\n"+ 
				"Last Name:"+lastName+"\n"+
				"Gender:"+gender;
				
	}
	public String getFirstName() {
		return firstName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	
}

