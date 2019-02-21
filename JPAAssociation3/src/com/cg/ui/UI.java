package com.cg.ui;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.dto.Product;
import com.cg.dto.Supllier;
import com.cg.util.JPAUtil;

public class UI {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntManager();
		EntityTransaction et = em.getTransaction();
	
		Product p1 = new Product();
		p1.setProductCode(100);
		p1.setProdName("TV");
		p1.setProdPrice(25000);

		Product p2 = new Product();
		p2.setProductCode(200);
		p2.setProdName("Fridge");
		p2.setProdPrice(10000);
		
		Product p3 = new Product();
		p3.setProductCode(300);
		p3.setProdName("Microwave");
		p3.setProdPrice(15000);
		
		Product p4 = new Product();
		p4.setProductCode(400);
		p4.setProdName("Mobile");
		p4.setProdPrice(13000);
		
		Set<Product> elecProd = new HashSet<>();
		elecProd.add(p1);
		elecProd.add(p2);
		elecProd.add(p3);

		Set<Product> Smart = new HashSet<>();
		Smart.add(p4);
		
		Supllier sony = new Supllier();
		Supllier lg = new Supllier();
		
		sony.setSupplierId(111);
		sony.setSupplyDate(new Date());
		sony.setProdSet(elecProd);
		
		lg.setSupplierId(222);
		lg.setSupplyDate(new Date());
		lg.setProdSet(Smart);
		
		Set<Supllier> suppProd = new HashSet<>();
		suppProd.add(sony);
		suppProd.add(lg);
		
		p1.setSupSet(suppProd);
		p2.setSupSet(suppProd);
		p3.setSupSet(suppProd);
		p4.setSupSet(suppProd);
		
		et.begin();
		em.persist(sony);
		em.persist(lg);
		et.commit();
		System.out.println("product is inserted");
		
		System.out.println("-------fetch-------");
		
	}
}
