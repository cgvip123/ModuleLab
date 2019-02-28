package com.cg.hr.service;

import java.util.ArrayList;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.dao.EmployeeDao;
import com.cg.hr.core.dao.IEmployeeDao;
import com.cg.hr.exception.EmpException;



public class EmployeeService implements IEmployeeService {

	IEmployeeDao emDao = new EmployeeDao();
	
	/*@Override
	public Employee addEmp(Employee e) {
		return emDao.addEmp(e);
	}
*/
	@Override
	public ArrayList<Employee> fetchAllEmp() throws EmpException {
		return emDao.fetchAllEmp();
	}
/*
	@Override
	public Employee deleteEmp(int empid) {
		return emDao.deleteEmp(empid);
	}*/

	@Override
	public Employee getEmpByEid(int empid) {
		return emDao.getEmpByEid(empid);
	}

	/*@Override
	public Employee updateEmp(int empid, String newName, float newSal) {
		return emDao.updateEmp(empid, newName, newSal);
	}*/

}
