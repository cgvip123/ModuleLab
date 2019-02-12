package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exception.SalesIdNotFoundException;

public interface ISaleService {

	public HashMap<Integer,Sale> insertSalesDetails(Sale sale) throws SalesIdNotFoundException;
	public boolean validateProductCode(int productId);
	boolean validateQuantity(int qty);
	public boolean validateProductCat(String prodCat);
	public boolean validateProductName(String prodName);
	public boolean validateProductPrice(float price);
}
