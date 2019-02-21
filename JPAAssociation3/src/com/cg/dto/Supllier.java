package com.cg.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "supplier_masters")
public class Supllier {

	@Id
	@Column(name = "supp_id",length =10)
	private int supplierId;
	
	@Temporal(value = TemporalType.DATE)
	private Date supplyDate;
 
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "prod_supply",joinColumns = {@JoinColumn(name="supp_id")},inverseJoinColumns = {@JoinColumn(name = "prod_code")})
	Set<Product> prodSet = new HashSet<>();
	
	
	public Set<Product> getProdSet() {
		return prodSet;
	}

	public void setProdSet(Set<Product> prodSet) {
		this.prodSet = prodSet;
	}

	public Supllier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supllier(int supplierId, Date supplyDate) {
		super();
		this.supplierId = supplierId;
		this.supplyDate = supplyDate;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public Date getSupplyDate() {
		return supplyDate;
	}

	public void setSupplyDate(Date supplyDate) {
		this.supplyDate = supplyDate;
	}

	@Override
	public String toString() {
		return "Supllier [supplierId=" + supplierId + ", supplyDate=" + supplyDate + ", prodSet=" + prodSet + "]";
	}
	
	
}
