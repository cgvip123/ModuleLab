package com.cg.hr.core.test;

import java.util.ArrayList;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.exception.EmpException;
import com.cg.hr.service.EmployeeService;
import com.cg.hr.service.IEmployeeService;

public class TempEmpList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IEmployeeService serv = new EmployeeService();
		
		ArrayList<Employee> emplist;
		try {
			emplist = serv.fetchAllEmp();
			for(Employee emp: emplist)
			{
				System.out.println(emp);
			}
		} catch (EmpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
