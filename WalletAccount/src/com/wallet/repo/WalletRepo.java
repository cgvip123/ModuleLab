package com.wallet.repo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.wallet.bean.Customer;
import com.wallet.exception.CustomerNotFoundException;
import com.wallet.exception.DuplicatePhoneException;

public class WalletRepo implements IWalletRepo {

	static Map<String,Customer> hm = new HashMap<>();
	public boolean save(Customer cus) throws DuplicatePhoneException
	{
		if(hm.containsKey(cus.getPhone()))
		{
			throw new DuplicatePhoneException();
		}
		else
		{
		hm.put(cus.getPhone(), cus);
		return true;
	}
	}
	
	public Customer showByPhone(String phone) throws CustomerNotFoundException
	{
		for(Entry<String,Customer> m: hm.entrySet())
		{
			if(m.getValue().getPhone().equals(phone))
			{
				 return m.getValue();
			}
		}
		throw new CustomerNotFoundException();
	}
	
	public Map<String,Customer> retriveAllDetails()
	{
		return hm;
	}
}
