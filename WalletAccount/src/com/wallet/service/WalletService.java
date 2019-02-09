package com.wallet.service;

import java.math.BigDecimal;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.wallet.bean.Customer;
import com.wallet.bean.Transaction;
import com.wallet.bean.Transaction.TransactionType;
import com.wallet.bean.Wallet;
import com.wallet.exception.CustomerNotFoundException;
import com.wallet.exception.DuplicatePhoneException;
import com.wallet.repo.IWalletRepo;

public class WalletService implements IWalletService {

	private IWalletRepo iw;
	public WalletService(IWalletRepo iw) {
		super();
		this.iw = iw;
	}
	public Customer save(String name,String phone ,BigDecimal balance) throws DuplicatePhoneException
	{
		Customer cus = new Customer();
		Wallet wallet = new Wallet();
		cus.setName(name);
		cus.setPhone(phone);
		cus.setWallet(wallet);
		wallet.setBalance(balance);
		if(iw.save(cus))
		{
			return cus;
		}
		return null;
	}
	
	public Customer findByPhone(String phone) throws CustomerNotFoundException
	{
		return iw.showByPhone(phone);
	}
	public Map<String, Customer> getDetails()
	{
		return iw.retriveAllDetails();
	}
	
	public Customer depositAmount(String phone,BigDecimal balance) throws CustomerNotFoundException
	{
		Transaction transaction = new Transaction();
		Customer cus = new Customer();
		cus = iw.showByPhone(phone);
		transaction.getTransType();
		transaction.setTransType(TransactionType.deposit);
		cus.getWallet().setBalance(cus.getWallet().getBalance().add(balance));
		return cus;
	}
	public Customer withdrawAmount(String phone,BigDecimal balance) throws CustomerNotFoundException
	{
		Transaction transaction = new Transaction();
		Customer cus = new Customer();
		cus = iw.showByPhone(phone);
		transaction.getTransType();
		transaction.setTransType(TransactionType.withdraw);
		cus.getWallet().setBalance(cus.getWallet().getBalance().subtract(balance));
		return cus;
	}
	public boolean isValidName(String name) {
		// TODO Auto-generated method stub
		Pattern namePattern = Pattern.compile("^[A-Za-z ]{3,}$");
		Matcher nameMatcher = namePattern.matcher(name);
		return nameMatcher.matches();
	}
	public boolean isvalidPhone(String phone)
	{
		Pattern namePattern = Pattern.compile("^[6-9][0-9]{9}$");
		Matcher nameMatcher = namePattern.matcher(phone);
		return nameMatcher.matches();
	}
}
