package com.cg.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "MGR")
public class Manager extends Emp {

	private String deptName;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int empid, String empName, float empSal,String deptName) {
		super(empid, empName, empSal);
		this.deptName = deptName;
		// TODO Auto-generated constructor stub
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + "]";
	}
	
}
