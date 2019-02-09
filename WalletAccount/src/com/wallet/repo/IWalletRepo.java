package com.wallet.repo;



import java.math.BigDecimal;
import java.util.Map;

import com.wallet.bean.Customer;
import com.wallet.exception.CustomerNotFoundException;
import com.wallet.exception.DuplicatePhoneException;

public interface IWalletRepo {

	boolean save(Customer cus) throws DuplicatePhoneException;

	Customer showByPhone(String phone) throws CustomerNotFoundException;
	
	Map<String, Customer> retriveAllDetails();
}