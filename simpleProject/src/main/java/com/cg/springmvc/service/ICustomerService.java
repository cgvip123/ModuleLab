package com.cg.springmvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.springmvc.bean.Customer;
@Service
public interface ICustomerService {

	public Customer addCustomer(Customer customer);
	public Customer findCustomer(int customerid);
	public Customer updateCustomer(Customer customer);
	public List<Customer> getCustomerList();
	public Customer removeCustomer(int id);
}
