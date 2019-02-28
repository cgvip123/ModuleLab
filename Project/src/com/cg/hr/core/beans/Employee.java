package com.cg.hr.core.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp1")
public class Employee {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "emp_id",length = 20)
	private int empid;
	
	@Column(name = "emp_name",length=30)
	private String empName;
	
	@Column(name="emp_sal",length=10)
	private float empSal;
	
	public Employee() {
		super();
	}
	public Employee(int empid, String empName, float empSal) {
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
		return "empid=" + empid + "\nempName=" + empName + "\nempSal=" + empSal + "\nempDoj=" + "\n";
	}
	
}
