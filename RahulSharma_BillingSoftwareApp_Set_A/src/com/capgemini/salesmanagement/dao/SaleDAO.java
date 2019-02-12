package com.capgemini.salesmanagement.dao;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exception.SalesIdNotFoundException;
import com.capgemini.salesmanagement.util.CollectionUtil;

public class SaleDAO implements ISaleDAO{
	public CollectionUtil collectioUtil = new CollectionUtil();
	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) throws SalesIdNotFoundException {
		// TODO Auto-generated method stub
		if(CollectionUtil.getCollection().containsKey(sale.getSaleId()))
		{
			throw new SalesIdNotFoundException();
		}
		CollectionUtil.getCollection().put(sale.getSaleId(),sale);
		return CollectionUtil.getCollection();
	}
	public Sale showBySalesId(int prodCode) throws SalesIdNotFoundException
	{
		if(CollectionUtil.getCollection().containsKey(prodCode))
		{
		return CollectionUtil.getCollection().get(prodCode);
		}
	throw new SalesIdNotFoundException();
	}
}
