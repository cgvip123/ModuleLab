package com.wallet.service;

import java.math.BigDecimal;
import java.util.Map;

import com.wallet.bean.Customer;
import com.wallet.exception.CustomerNotFoundException;
import com.wallet.exception.DuplicatePhoneException;

public interface IWalletService {

	Customer save(String name, String phone, BigDecimal balance) throws DuplicatePhoneException;

	Customer findByPhone(String phone) throws CustomerNotFoundException;

	Map<String, Customer> getDetails() ;
	
	public Customer depositAmount(String phone,BigDecimal balance) throws CustomerNotFoundException;
}