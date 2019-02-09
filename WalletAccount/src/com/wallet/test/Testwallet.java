package com.wallet.test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import com.wallet.bean.Customer;
import com.wallet.bean.Wallet;
import com.wallet.exception.CustomerNotFoundException;
import com.wallet.exception.DuplicatePhoneException;
import com.wallet.repo.WalletRepo;
import com.wallet.service.WalletService;

class Testwallet {

	@Test
	void test() {
		Customer cus = new Customer();
		Wallet wallet = new Wallet();
		WalletService ws = new WalletService(new WalletRepo());
		cus.setName("raj");
		cus.setPhone("2317423978");
		cus.setWallet(wallet);
		wallet.setBalance(new BigDecimal(3000));
		try {
			assertEquals(cus, ws.save("raj", "2317423978",new BigDecimal(3000)));
		} catch (DuplicatePhoneException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fail("Not yet implemented");
	}
	@Test
	void test1() {
		Customer cus = new Customer();
		Wallet wallet = new Wallet();
		WalletService ws = new WalletService(new WalletRepo());
		cus.setName("raj");
		cus.setPhone("2317423978");
		cus.setWallet(wallet);
		wallet.setBalance(new BigDecimal(3000));
		try {
			assertEquals(cus, ws.findByPhone("2317423978"));
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fail("Not yet implemented");
	}

}
