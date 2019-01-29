package com.lab5_1.cg.eis.bean;

public class Employee {

		private int id;
		private String name;
		private double salary;
		private String designation;
		private char insurScheme;
		
		public Employee(int id, String name, double salary, String designation, char insurScheme) {
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.designation = designation;
			this.insurScheme = insurScheme;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public void setInsurScheme(char insurScheme) {
			this.insurScheme = insurScheme;
		}
		public String getName() {
			return name;
		}
		public double getSalary() {
			return salary;
		}
		public String getDesignation() {
			return designation;
		}
		public char getInsurScheme() {
			return insurScheme;
		}
		
}
