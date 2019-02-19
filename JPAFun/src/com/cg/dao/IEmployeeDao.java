package com.cg.dao;

import java.util.ArrayList;

import com.cg.dto.Employee;

public interface IEmployeeDao {

	public Employee addEmp(Employee e);
	public ArrayList<Employee> fetchAllEmp();
	public Employee deleteEmp(int empid);
	public Employee getEmpByEid(int empid);
	public Employee updateEmp(int empid,String newName,float newSal);
}
