package com.cg.service;

import java.util.ArrayList;

import com.cg.dao.EmployeeDao;
import com.cg.dao.IEmployeeDao;
import com.cg.dto.Employee;

public class EmployeeService implements IEmployeeService {

	IEmployeeDao emDao = new EmployeeDao();
	
	@Override
	public Employee addEmp(Employee e) {
		return emDao.addEmp(e);
	}

	@Override
	public ArrayList<Employee> fetchAllEmp() {
		return emDao.fetchAllEmp();
	}

	@Override
	public Employee deleteEmp(int empid) {
		return emDao.deleteEmp(empid);
	}

	@Override
	public Employee getEmpByEid(int empid) {
		return emDao.getEmpByEid(empid);
	}

	@Override
	public Employee updateEmp(int empid, String newName, float newSal) {
		return emDao.updateEmp(empid, newName, newSal);
	}

}
