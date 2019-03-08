package com.cg.springmvc.repo;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.springmvc.bean.Customer;
@Repository
@Transactional
public interface ICustomerRepository {

	public Customer addCustomer(Customer customer);
	public Customer findCustomer(int customerid);
	public Customer updateCustomer(Customer customer);
	public List<Customer> getCustomerList();
public Customer removeCustomer(int custid);
}
