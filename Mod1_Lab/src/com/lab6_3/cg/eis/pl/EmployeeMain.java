package com.lab6_3.cg.eis.pl;

import com.lab5_1.cg.eis.service.Services;
import com.lab6_3.cg.eis.exception.EmployeeException;
import com.lab7_6.cg.eis.bean.Employee;

public class EmployeeMain {

		public static void check(Employee emp) throws EmployeeException
		{
			if(emp.getSalary()<3000)
			{
				throw new EmployeeException("Salary should be more than 3000");
			}
			else
			{
				System.out.println("good to go");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Services ser = new Services();
		Employee emp = ser.EmployeeDetails(1, "Smith", 40000, "Manager", 'P');
		try {
			check(emp);
		}
		catch(Exception e)
		{
			System.out.println("Exception occur:"+e);
		}
		ser.insureScheme(emp.getSalary(), emp.getDesignation(), emp);
		ser.AllDetails(emp);
		System.out.println("-------------------------------");
		ser.AllDetails(emp);
	}

}
