package com.cg.service;

import java.util.ArrayList;

import com.cg.dao.EmployeeDao;
import com.cg.dao.IEmployeeDao;
import com.cg.dto.Emp;

public class EmployeeService implements IEmployeeService {

	IEmployeeDao emDao = new EmployeeDao();
	
	@Override
	public Emp addEmp(Emp e) {
		return emDao.addEmp(e);
	}

	@Override
	public ArrayList<Emp> fetchAllEmp() {
		return emDao.fetchAllEmp();
	}

	@Override
	public Emp deleteEmp(int empid) {
		return emDao.deleteEmp(empid);
	}

	@Override
	public Emp getEmpByEid(int empid) {
		return emDao.getEmpByEid(empid);
	}

	@Override
	public Emp updateEmp(int empid, String newName, float newSal) {
		return emDao.updateEmp(empid, newName, newSal);
	}

}
