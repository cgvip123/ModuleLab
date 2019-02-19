package com.cg.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "emp1")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "emp_id",length = 20)
	private int empid;
	
	@Column(name = "emp_name",length=30)
	private String empName;
	
	@Column(name="emp_sal",length=10)
	private float empSal;
	
	@Transient
	private LocalDate empDoj;
	public Employee() {
		super();
	}
	public Employee(int empid, String empName, float empSal, LocalDate empDoj) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empSal = empSal;
		this.empDoj = empDoj;
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
	public LocalDate getEmpDoj() {
		return empDoj;
	}
	public void setEmpDoj(LocalDate empDoj) {
		this.empDoj = empDoj;
	}
	@Override
	public String toString() {
		return "empid=" + empid + "\nempName=" + empName + "\nempSal=" + empSal + "\nempDoj=" + empDoj + "\n";
	}
	
}
