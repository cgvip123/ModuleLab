package com.lab2.q2_4;

public class Person {
	String firstName;
	String lastName;
	char gender;
	String mobile;
	
	public Person(String firstName, String lastName, char gender, String mobile) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobile = mobile;
	}
	public String display()
	{
		return "Person Details: \n -----------------"+"\n"+
				"First Name:"+firstName+"\n"+ 
				"Last Name:"+lastName+"\n"+
				"Gender:"+gender+"\n"
				+"Mobile:"+mobile;
	}
	public String getFirstName() {
		return firstName;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
