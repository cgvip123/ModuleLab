package com.lab9_3.cg.eis.pl;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.lab9_3.cg.eis.bean.Employee;
import com.lab9_3.cg.eis.exception.EmployeeException;
import com.lab9_3.cg.eis.service.Services;


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
	public static void main(String[] args)  {
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
		ser.WriteReadFile(emp);
	}

}
