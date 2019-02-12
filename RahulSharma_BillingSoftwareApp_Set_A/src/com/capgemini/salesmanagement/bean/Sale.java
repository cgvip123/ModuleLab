package com.capgemini.salesmanagement.bean;

import java.time.LocalDate;

public class Sale {

	private int SaleId;
	private int prodCode;
	private int quantity;
	private String category;
	private String productName;
	private LocalDate saleDate;
	private int price;
	private float lineTotal;
	public int getSaleId() {
		return SaleId;
	}
	public void setSaleId(int saleId) {
		SaleId = saleId;
	}
	public int getProdCode() {
		return prodCode;
	}
	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public LocalDate getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(LocalDate saleDate) {
		this.saleDate = saleDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public float getLineTotal() {
		return lineTotal;
	}
	public void setLineTotal(float lineTotal) {
		this.lineTotal = lineTotal;
	}
	@Override
	public String toString() {
		return " SaleId=" + SaleId + ", prodCode=" + prodCode + ", quantity=" + quantity + ", category=" + category
				+ ", productName=" + productName +  ", saleDate=" + saleDate
				+ ", price=" + price + ", lineTotal=" + lineTotal + "]";
	}
	
}
