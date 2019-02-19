package com.cg.service;

import java.util.ArrayList;

import com.cg.dto.Emp;

public interface IEmployeeService {

	public Emp addEmp(Emp e);
	public ArrayList<Emp> fetchAllEmp();
	public Emp deleteEmp(int empid);
	public Emp getEmpByEid(int empid);
	public Emp updateEmp(int empid,String newName,float newSal);
}
