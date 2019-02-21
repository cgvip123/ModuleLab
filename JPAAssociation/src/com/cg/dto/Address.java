package com.cg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@Column(name = "addr_Id", length = 10)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	
	@Column(name = "street",length = 25)
	private String street;
	
	@Column(name = "city",length =25)
	private String city;
	
	@Column(name = "zipcode",length = 6)
	private String zipcode;
	
	@Column(name = "state",length = 25)
	private String state;
	
	
	public Address() {
		super();
	}
	
	public Address(int addressId, String street, String city, String zipcode, String state) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
	}

	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
