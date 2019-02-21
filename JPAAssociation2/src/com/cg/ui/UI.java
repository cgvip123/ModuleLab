package com.cg.ui;

import java.util.HashSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.dto.Department;
import com.cg.dto.Employee;
import com.cg.util.JPAUtil;

public class UI {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntManager();
		EntityTransaction et = em.getTransaction();
		
		Department d1 = new Department();
		d1.setDeptCode(20);
		d1.setDeptName("Admin");

		Department d2 = new Department();
		d2.setDeptCode(30);
		d2.setDeptName("java");

		Employee e1 = new Employee();
		e1.setEmpId(111);
		e1.setEmpName("rahul");
		e1.setEmpSal(20000);
		e1.setEmpDept(d1);
		
		Employee e2 = new Employee();
		e2.setEmpId(222);
		e2.setEmpName("shubham");
		e2.setEmpSal(80000);
		e2.setEmpDept(d2);
		
		Employee e3 = new Employee();
		e3.setEmpId(333);
		e3.setEmpName("satya");
		e3.setEmpSal(10000);
		e3.setEmpDept(d2);

		Employee e4 = new Employee();
		e4.setEmpId(444);
		e4.setEmpName("arvind");
		e4.setEmpSal(90000);
		e4.setEmpDept(d1);
		
		HashSet<Employee> adminEmpSet = new HashSet<>();
		adminEmpSet.add(e1);
		adminEmpSet.add(e2);
		
		HashSet<Employee> javaEmpSet = new HashSet<>();
		javaEmpSet.add(e3);
		javaEmpSet.add(e4);

		d1.setEmpSet(adminEmpSet);
		d2.setEmpSet(javaEmpSet);
		
		et.begin();
		em.persist(d1);
		em.persist(d2);
		et.commit();
		System.out.println("emp is inserted");
		
		System.out.println("-------fetch-------");
		
	}
}
