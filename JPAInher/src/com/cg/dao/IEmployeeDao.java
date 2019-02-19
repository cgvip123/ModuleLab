package com.cg.dao;

import java.util.ArrayList;

import com.cg.dto.Emp;

public interface IEmployeeDao {

	public Emp addEmp(Emp e);
	public ArrayList<Emp> fetchAllEmp();
	public Emp deleteEmp(int empid);
	public Emp getEmpByEid(int empid);
	public Emp updateEmp(int empid,String newName,float newSal);
}
