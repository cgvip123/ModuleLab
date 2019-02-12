package com.capgemini.salesmanagement.dao;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exception.SalesIdNotFoundException;

public interface ISaleDAO {

	public HashMap<Integer,Sale> insertSalesDetails(Sale sale) throws SalesIdNotFoundException;
	public Sale showBySalesId(int prodCode) throws SalesIdNotFoundException;
}
