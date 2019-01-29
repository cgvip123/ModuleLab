package com.lab2.q2_3;

public class Person {
	
		String FirstName;
		String LastName;
		char Gender;
		public Person(String firstName, String lastName, char gender) {
			super();
			this.FirstName = firstName;
			this.LastName = lastName;
			this.Gender = gender;
		}
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public char getGender() {
			return Gender;
		}
		public void setGender(char gender) {
			Gender = gender;
		}
}
