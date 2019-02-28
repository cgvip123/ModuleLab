package com.cg.hr.service;

import java.util.ArrayList;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.exception.EmpException;


public interface IEmployeeService {

	public ArrayList<Employee> fetchAllEmp() throws EmpException;

	Employee getEmpByEid(int empid);

}
