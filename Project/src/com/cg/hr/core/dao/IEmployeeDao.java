package com.cg.hr.core.dao;

import java.util.ArrayList;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.exception.EmpException;

public interface IEmployeeDao {

	ArrayList<Employee> fetchAllEmp() throws EmpException;

	Employee getEmpByEid(int empid);

	
}
