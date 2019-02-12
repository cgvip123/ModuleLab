package com.capgemini.salesmanagement.service;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.exception.SalesIdNotFoundException;

public class SaleService implements ISaleService {

	private ISaleDAO saleDao;
	public SaleService(ISaleDAO saleDao) {
		super();
		this.saleDao = saleDao;
	}

	 
	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) throws SalesIdNotFoundException {
		// TODO Auto-generated method stub
		return saleDao.insertSalesDetails(sale);
	}
	
	/**
	 * Method name: double calculateCost(int quantity,int prodCode)
	 * parameter:int quantity,int prodCode
	 * author: rahul sharma
	 * return type: double
	 * @throws SalesIdNotFoundException 
	 */
	public double calculateCost(int quantity,int prodCode) throws SalesIdNotFoundException
	{
		double prodPrice1 = saleDao.showBySalesId(prodCode).getPrice();
		double lineTotal = prodPrice1 * quantity;
		return lineTotal;
	}
	/**
	 * Method name: boolean validateProductCode(int productId)
	 * parameter:int productId
	 * author: rahul sharma
	 * return type: boolean
	 */
	@Override
	public boolean validateProductCode(int productId) {
		// TODO Auto-generated method stub
		String prodId = ""+productId;
		Pattern pattern = Pattern.compile("^\\d{4}$");
		Matcher matcher = pattern.matcher(prodId);
		return matcher.matches();
	}

	/**
	 * Method name: boolean validateQuantity(int qty)
	 * parameter:int qty
	 * author: rahul sharma
	 * return type: boolean
	 */
	@Override
	public boolean validateQuantity(int qty) {
		// TODO Auto-generated method stub
		if(qty>0&&qty<5)
		{
		return true;
	}
		return false;
	}

	/**
	 * Method name: boolean validateCat(int productId)
	 * parameter:int prodCat
	 * author: rahul sharma
	 * return type: boolean
	 */
	@Override
	public boolean validateProductCat(String prodCat) {
		// TODO Auto-generated method stub
		if(prodCat.equals("Electronics") || prodCat.equals("Toys"))
			return true;
		return false;
	}

	/**
	 * Method name: boolean validateProductName(int prodName)
	 * parameter:int productName
	 * author: rahul sharma
	 * return type: boolean
	 */
	@Override
	public boolean validateProductName(String prodName) {
		// TODO Auto-generated method stub
		Sale sale = new Sale();
		if(sale.getCategory().equals("Electronics")||sale.getCategory().equals("Toys"))
		{
			
			return true;
		}
		return false;
	}

	/**
	 * Method name: boolean validateProductCode(float price)
	 * parameter:float price
	 * author: rahul sharma
	 * return type: boolean
	 */
	@Override
	public boolean validateProductPrice(float price) {
		// TODO Auto-generated method stub
		if(price>200)
			return true;
		return false;
	}
}
