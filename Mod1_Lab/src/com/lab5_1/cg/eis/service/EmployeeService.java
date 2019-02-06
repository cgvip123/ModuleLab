package com.lab5_1.cg.eis.service;

import com.lab5_1.cg.eis.bean.Employee;

public interface EmployeeService {

		Employee EmployeeDetails(int id, String name, double salary, String designation, char insurScheme);
		void AllDetails(Employee e);
		void insureScheme(double salary, String designation, Employee emp);
}
