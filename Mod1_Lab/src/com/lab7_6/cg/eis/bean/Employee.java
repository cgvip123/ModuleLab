package com.lab7_6.cg.eis.bean;

public class Employee {

		private String name;
		private double salary;
		private String designation;
		private String insurScheme;
		
		public Employee( String name, double salary, String designation, String insurScheme) {
			this.name = name;
			this.salary = salary;
			this.designation = designation;
			this.insurScheme = insurScheme;
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
		public void setInsurScheme(String insurScheme) {
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
		public String getInsurScheme() {
			return insurScheme;
		}
		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + ", designation=" + designation + ", insurScheme="
					+ insurScheme + "]";
		}
}
