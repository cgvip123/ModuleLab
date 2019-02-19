package com.cg.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.dto.Employee;
import com.cg.util.JPAUtil;

public class EmployeeDao implements IEmployeeDao {
	EntityManager em = null;
	EntityTransaction enTrans = null;
	public  EmployeeDao() {
		em = JPAUtil.getEntManager();
		enTrans = em.getTransaction();
	}
	@Override
	public Employee addEmp(Employee e) {
		enTrans.begin();
		em.persist(e); //Insert Operation
		enTrans.commit();
		return e;
	}

	@Override
	public ArrayList<Employee> fetchAllEmp() {
		String selAllQry = "select emps from Employee emps";
		TypedQuery<Employee> tq = em.createQuery(selAllQry,Employee.class);
		ArrayList<Employee> al = (ArrayList<Employee>) tq.getResultList();
		return al;
	}

	@Override
	public Employee deleteEmp(int empid) {
		Employee e1 = em.find(Employee.class, empid);
		enTrans.begin();
		em.remove(e1);
		enTrans.commit();
		return e1;
	}

	@Override
	public Employee getEmpByEid(int empid) {
		Employee ee = em.find(Employee.class, empid); // Find Operation
		return ee;
	}

	@Override
	public Employee updateEmp(int empid, String newName, float newSal) {
		// TODO Auto-generated method stub
		Employee ee = em.find(Employee.class, empid);
		ee.setEmpName(newName);
		ee.setEmpSal(newSal);
		enTrans.begin();
		em.merge(ee);
		enTrans.commit();
		return ee;
	}

}
