package com.cg.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product_masters")
public class Product 
{
	@Id
	@Column(name = "prod_code",length = 10)
	private int productCode;
	
	@Column(name = "prod_name",length = 10)
	private String prodName;
	
	@Column(name = "prod_price",length = 10)
	private int prodPrice;

	@ManyToMany(mappedBy = "prodSet")
	Set<Supllier> supSet = new HashSet<>();
	
	public Set<Supllier> getSupSet() {
		return supSet;
	}

	public void setSupSet(Set<Supllier> supSet) {
		this.supSet = supSet;
	}

	

	public Product(int productCode, String prodName, int prodPrice, Set<Supllier> supSet) {
		super();
		this.productCode = productCode;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.supSet = supSet;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", prodName=" + prodName + ", prodPrice=" + prodPrice
				+ ", supSet=" + supSet + "]";
	}

	
	
}
