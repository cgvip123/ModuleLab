package com.capgemini.salesmanagement.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.exception.SalesIdNotFoundException;
import com.capgemini.salesmanagement.service.SaleService;

public class SaleDAOTest {

	SaleDAO saleDao = new SaleDAO();
	SaleService saleservice = new SaleService(saleDao);
	@Test
	public void test() throws SalesIdNotFoundException {
		//fail("Not yet implemented");
		Sale sale = new Sale();
		int saleId = (int) ((Math.random() * 10) + 1000);
		sale.setSaleId(saleId);
		sale.setProdCode(sale.getSaleId());
		sale.setQuantity(2);
		sale.setSaleDate(LocalDate.now());
		sale.setCategory("Electronics");
		sale.setProductName("iphone");
		sale.setPrice(35000);
		assertEquals(sale, saleDao.insertSalesDetails(sale).get(sale.getProdCode()));
	}

}
