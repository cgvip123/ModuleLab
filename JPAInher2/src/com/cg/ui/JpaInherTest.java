package com.cg.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.dto.Emp;
import com.cg.dto.Manager;
import com.cg.util.JPAUtil;

public class JpaInherTest {

	public static void main(String[] args) {
		Emp rahul = new Emp();
		rahul.setEmpName("rahul sharma");
		rahul.setEmpSal(60000);
		Manager vaishali = new Manager();
		vaishali.setEmpName("vaishaliS");
		vaishali.setEmpSal(50000);
		vaishali.setDeptName("java");
		EntityManager em = JPAUtil.getEntManager();
		EntityTransaction ent =  em.getTransaction();
		ent.begin();
		em.persist(rahul);
		em.persist(vaishali);
		ent.commit();
		System.out.println("data is inserted");
	}
}
