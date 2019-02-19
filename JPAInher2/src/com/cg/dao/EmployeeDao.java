package com.cg.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import com.cg.dto.Emp;
import com.cg.util.JPAUtil;

public class EmployeeDao implements IEmployeeDao {
	EntityManager em = null;
	EntityTransaction enTrans = null;
	public  EmployeeDao() {
		em = JPAUtil.getEntManager();
		enTrans = em.getTransaction();
	}
	@Override
	public Emp addEmp(Emp e) {
		enTrans.begin();
		em.persist(e); //Insert Operation
		enTrans.commit();
		return e;
	}

	@Override
	public ArrayList<Emp> fetchAllEmp() {
		String selAllQry = "select emps from Employee emps";
		TypedQuery<Emp> tq = em.createQuery(selAllQry,Emp.class);
		ArrayList<Emp> al = (ArrayList<Emp>) tq.getResultList();
		return al;
	}

	@Override
	public Emp deleteEmp(int empid) {
		Emp e1 = em.find(Emp.class, empid);
		enTrans.begin();
		em.remove(e1);
		enTrans.commit();
		return e1;
	}

	@Override
	public Emp getEmpByEid(int empid) {
		Emp ee = em.find(Emp.class, empid); // Find Operation
		return ee;
	}

	@Override
	public Emp updateEmp(int empid, String newName, float newSal) {
		// TODO Auto-generated method stub
		Emp ee = em.find(Emp.class, empid);
		ee.setEmpName(newName);
		ee.setEmpSal(newSal);
		enTrans.begin();
		em.merge(ee);
		enTrans.commit();
		return ee;
	}

}
