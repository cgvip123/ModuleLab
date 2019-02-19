package com.cg.dto;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "emp_store")
@Inheritance(strategy =InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="EMP_TYPE",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "EMP")
public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int empid;
	private String empName;
	private float empSal;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empid, String empName, float empSal) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSal = empSal;
	}

	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
}
