package com.capgemini.salesmanagement.ui;

import java.time.LocalDate;


import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.exception.SalesIdNotFoundException;
import com.capgemini.salesmanagement.service.SaleService;

public class Client {

	static SaleService saleService = new SaleService(new SaleDAO());
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("---------------Billing Software Application----------------");
		System.out.println("1.Enter the Product Details");
		System.out.println("2.Exit");
		System.out.println("Enter the Choice");
		int choice = scanner.nextInt();
		scanner.nextLine();
		switch (choice) {
		case 1:
			getDetails();
			break;
		case 2:
			System.exit(0);
		}
	}

	private static void getDetails() {
		// TODO Auto-generated method stub
		Sale sale = new Sale();
		int salesId = (int) ((Math.random() * 10) + 1000);
		System.out.println(salesId);
		sale.setSaleId(salesId);
		LocalDate saleDate = LocalDate.now();
		sale.setSaleDate(saleDate);
		System.out.println("Enter the product code:");
		int prodCode = scanner.nextInt();
		if(saleService.validateProductCode(prodCode))
		{
		sale.setProdCode(prodCode);
		System.out.println("Enter the quantity:");
		int quantity = scanner.nextInt();
		if(saleService.validateQuantity(quantity))
		{
		sale.setQuantity(quantity);
		System.out.println("Product Category:");
		String category = scanner.next();
		if(saleService.validateProductCat(category))
		{
		sale.setCategory(category);
		System.out.println("Product Name:");
		String name = scanner.next();
		sale.setProductName(name);
		System.out.println("Product Price:");
		int prodPrice = scanner.nextInt();
		if(saleService.validateProductPrice(prodPrice))
		{
		sale.setPrice(prodPrice);
		Sale sale1;
		try {
			sale1 = saleService.insertSalesDetails(sale).get(prodCode);
			sale.setLineTotal((float) saleService.calculateCost(quantity, prodCode));
			System.out.println(sale1);
		} catch (SalesIdNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else
		{
			System.err.println("price should be greater");
		}
		}
		else
		{
			System.err.println("category should be either Electtronics or toys");
		}
	}
		else
		{
			System.err.println("quantity less than 5");
		}
	}
	else
		{
			System.err.println("should be size 4");
		}
	}
}