package com.cg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.css.CSSUnknownRule;

import com.cg.springmvc.bean.Customer;
import com.cg.springmvc.service.CustomerServiceImpl;
import com.cg.springmvc.service.ICustomerService;

@RestController
public class HelloController {

	@Autowired
	CustomerServiceImpl cusImpl;
	
	@RequestMapping(value = "/getCustomer",method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
	public Customer getCustomer(@RequestBody Customer cus)
	{
		
		cus = cusImpl.addCustomer(cus);
		return cus;
	}
	
	@RequestMapping(value = "/findCustomer/{id}", produces = "application/json" )
	public Customer findCustomer(@PathVariable int id)
	{
		Customer cus = new Customer();
		cus = cusImpl.findCustomer(id);
		return cus;
		
	}
	
	@RequestMapping(value = "/getCustomerList", produces = "application/json")
	public List<Customer> getCustomer()
	{
		List<Customer> al = cusImpl.getCustomerList();
		return al;
	}
	
	@RequestMapping(value = "/updateCustomer", method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
	public Customer update(@RequestBody Customer cus)
	{
		cus = cusImpl.updateCustomer(cus);
		return cus;
	}
	
	@RequestMapping(value = "/deleteCustomer/{id}", produces ="application/json")
	public Customer del(@PathVariable int id)
	{
		Customer cus = new Customer();
		cus = cusImpl.removeCustomer(id);
		return cus;
	}
}
