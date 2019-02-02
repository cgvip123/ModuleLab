package com.lab5_1.cg.eis.service;

import com.lab7_6.cg.eis.bean.Employee;

public class Services implements EmployeeService {
		public Employee EmployeeDetails(int id, String name, double salary, String designation, char insurScheme) {
			Employee emp = new Employee(id,name,salary,designation,insurScheme);
			return emp;
		}
		public void insureScheme(double salary, String designation,Employee emp) {
			
			if((salary>5000 && salary<20000) && designation.equals("System Associate"))
			{
				emp.setInsurScheme('C');
			}
			else if((salary>=20000 && salary<40000) && designation.equals("Programmer"))
			{
				emp.setInsurScheme('B');
			}
			else if(salary>=40000 && designation.equals("Manager"))
			{
				emp.setInsurScheme('A');
			}
			else
			{
				emp.setInsurScheme('N');
			}
		}
		public void AllDetails(Employee emp) {
						System.out.println("id:"+emp.getId()+"\n"+"Name:"+emp.getName()+"\n"+"Salary:"+emp.getSalary()+"\n"+
											"Designation:"+emp.getDesignation()+"\n"+"InsuranceScheme:"+emp.getInsurScheme());
		}
		
		

}
