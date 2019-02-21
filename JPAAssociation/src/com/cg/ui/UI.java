package com.cg.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.dto.Address;
import com.cg.dto.Student;
import com.cg.util.JPAUtil;


public class UI {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntManager();
		EntityTransaction et = em.getTransaction();
		
		Address vaishaliAddr = new Address();
		
		vaishaliAddr.setCity("pune");
		vaishaliAddr.setState("Maharashtra");
		vaishaliAddr.setStreet("Sinhagad road");
		vaishaliAddr.setZipcode("411041");
		
		Address vaishaliAddr1 = new Address();
		
		vaishaliAddr1.setCity("gaziabad");
		vaishaliAddr1.setState("UP");
		vaishaliAddr1.setStreet("GT road");
		vaishaliAddr1.setZipcode("200731");
		
		Address vaishaliAddr2 = new Address();
		
		vaishaliAddr2.setCity("Mathura");
		vaishaliAddr2.setState("UP");
		vaishaliAddr2.setStreet("Township");
		vaishaliAddr2.setZipcode("281006");
		
		Address vaishaliAddr3 = new Address();
		
		vaishaliAddr3.setCity("arga");
		vaishaliAddr3.setState("UP");
		vaishaliAddr3.setStreet("teri baghiya");
		vaishaliAddr3.setZipcode("211098");
		
		Student rahul = new Student();
		
		rahul.setStuName("rahul sharma");
		rahul.setStuAddress(vaishaliAddr);
		
		Student satya = new Student();
		
		satya.setStuName("saya sharma");
		satya.setStuAddress(vaishaliAddr1);
		
		Student sunil = new Student();
		
		sunil.setStuName("pushkal goyal");
		sunil.setStuAddress(vaishaliAddr2);
		
		Student shubham = new Student();
		
		shubham.setStuName("brajesh mishra");
		shubham.setStuAddress(vaishaliAddr3);
		
		et.begin();
		em.persist(rahul);
		em.persist(satya);
		em.persist(sunil);
		em.persist(shubham);
		et.commit();
		
		System.out.println("data is inserted");
		
		/*System.out.println("-------fetch-------");
		Address e1 = em.find(Address.class, 76);
		et.begin();
		em.remove(e1);
		et.commit();*/
		
		System.out.println("deleted");
	}
}
