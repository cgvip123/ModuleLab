package com.wallet.repo;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wallet.Util.DbUtil;
import com.wallet.bean.Customer;
import com.wallet.bean.Transaction;
import com.wallet.bean.Transaction.TransactionType;
import com.wallet.bean.Wallet;
import com.wallet.exception.CustomerNotFoundException;
import com.wallet.exception.DuplicatePhoneException;


public class WalletRepo implements IWalletRepo {

	//********************************Wallet Account*******************************************************
	/*******************************************************************************************************
	 - Function Name	:	save(Customer cus)
	 - Input Parameters	:	Customer cus
	 - Return Type		:	boolean
	 - Throws			:  	DuplicatePhoneException
	 - Author			:	Rahul sharma
	 - Creation Date	:	8/02/2019
	 - Description		:	Adding Customer
	 ********************************************************************************************************/
	public boolean save(Customer cus) throws DuplicatePhoneException
	{
			Connection con;
			con = DbUtil.getCon();
			PreparedStatement pst;
			try {
				pst = con.prepareStatement("insert into customer values(?,?)");
				pst.setString(1, cus.getPhone());
				pst.setString(2, cus.getName());
				int check = pst.executeUpdate();
				System.out.println("Data is inserted:"+check);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Customer table error");
				e.printStackTrace();
			}
			
			PreparedStatement pst1;
			try {
				pst1 = con.prepareStatement("insert into wallet values(?,?)");
				pst1.setString(1, cus.getPhone());
				pst1.setBigDecimal(2, cus.getWallet().getBalance());
				int check1 = pst1.executeUpdate();
				System.out.println("Data is inserted:"+check1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("wallet table error");
				e.printStackTrace();
			}
	
		return true;
	}
	/*******************************************************************************************************
	 - Function Name	:	showByPhone(String phone)
	 - Input Parameters	:	String phone
	 - Return Type		:	Customer
	 - Throws			:  	CustomerNotFoundException
	 - Author			:	Rahul sharma
	 - Creation Date	:	8/02/2019
	 - Description		:	Show information through Mobile number
	 ********************************************************************************************************/
	public Customer showByPhone(String phone) throws CustomerNotFoundException
	{
		Connection con;
		Customer cus =new Customer();
		try {
			con = DbUtil.getCon();
			
			PreparedStatement ps = con.prepareStatement("select name from customer where phone = ?");
			PreparedStatement ps1 = con.prepareStatement("select balance from wallet where phone = ?");
			
			ps.setString(1, phone);
			ps1.setString(1, phone);
			
			ResultSet rs = ps.executeQuery();
			ResultSet rs1 = ps1.executeQuery();
			
			rs.next();
			rs1.next();
			
			Wallet wallet = new Wallet();
			
			cus.setName(rs.getString(1));
			wallet.setBalance(rs1.getBigDecimal(1));
			cus.setWallet(wallet);
			return cus;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/*******************************************************************************************************
	 - Function Name	:	retriveAllDetails(String phone)
	 - Input Parameters	:	String phone
	 - Return Type		:	ArrayList<Transaction>
	 - Throws			:  	NA
	 - Author			:	Rahul sharma
	 - Creation Date	:	8/02/2019
	 - Description		:	return the Transaction happen between Customer List
	 ********************************************************************************************************/
	public ArrayList<Transaction> retriveAllDetails() 
	{
		Connection con = DbUtil.getCon();
		 int count = 0;
		 
		 PreparedStatement ps =null;
		 PreparedStatement ps1 =null;
		 ResultSet rs = null;
		 ResultSet rs1 = null;
		 
		 ArrayList<Transaction> custList = new ArrayList<>();
		 
		 try {
			ps = con.prepareStatement("select t from transaction t");
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				Transaction t = new Transaction();
				t.setSenderPhone(rs.getString(1));
				t.setRecieverPhone(rs.getString(2));
				t.setBalance(rs.getBigDecimal(3));
				t.setTransType((TransactionType) rs.getObject(4));
				custList.add(t);
				count++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 if(count==0)
		 {
			 return null;
		 }
		 else
		 {
			 return custList;
		 }
}
	/*******************************************************************************************************
	 - Function Name	:	saveTransaction(String mobileNo, Transaction t)
	 - Input Parameters	:	String mobileNo, Transaction t
	 - Return Type		:	boolean
	 - Throws			:  	CustomerNotFoundException
	 - Author			:	Rahul sharma
	 - Creation Date	:	8/02/2019
	 - Description		:	add the transaction happen between Customer
	 ********************************************************************************************************/
	public boolean saveTransaction(String mobileNo, Transaction t) throws CustomerNotFoundException
	{
		Connection con = DbUtil.getCon();
		PreparedStatement pst  =null;
		
		
		try {
			pst = con.prepareStatement("insert into transaction values(?,?,?,?)");
			pst.setString(1, mobileNo);
			pst.setString(2, t.getRecieverPhone());
			pst.setBigDecimal(3, t.getBalance());
			pst.setString(4, t.getTransType().toString());
			pst.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		/*if(hm.containsKey(mobileNo))
		{
			hm.get(mobileNo).getAl().add(t);
			return true;
		}
		throw new CustomerNotFoundException();*/
	}
	
	
}
