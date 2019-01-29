package com.lab5_1.cg.eis.pl;

import com.lab5_1.cg.eis.bean.Employee;
import com.lab5_1.cg.eis.service.Services;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Services ser = new Services();
		Employee emp = ser.EmployeeDetails(1, "Smith", 50000, "Manager", 'P');
		ser.insureScheme(emp.getSalary(), emp.getDesignation(), emp);
		ser.AllDetails(emp);
		System.out.println("-------------------------------");
		ser.AllDetails(emp);
	}

}
