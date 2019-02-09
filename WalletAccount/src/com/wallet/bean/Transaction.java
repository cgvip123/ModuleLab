package com.wallet.bean;

import java.math.BigDecimal;

public class Transaction {

	private int senderId;
	private int recieverId;
	private BigDecimal balance;
	public enum TransactionType{deposit,withdraw,fundtransfer_to,fundTransfer_from};
	private TransactionType transType;
	public int getSenderId() {
		return senderId;
	}
	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}
	public int getRecieverId() {
		return recieverId;
	}
	public void setRecieverId(int recieverId) {
		this.recieverId = recieverId;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public TransactionType getTransType() {
		return transType;
	}
	public void setTransType(TransactionType transType) {
		this.transType = transType;
	}
}
