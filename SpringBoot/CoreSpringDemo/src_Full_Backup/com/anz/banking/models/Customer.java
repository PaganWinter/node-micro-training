package com.anz.banking.models;

import java.util.List;

public class Customer {

	private int customerId;
	private String name;
	private int accountNo;
	private String address;
	private String email;
	private List<DebitCard> debitCardList;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<DebitCard> getDebitCardList() {
		return debitCardList;
	}
	public void setDebitCardList(List<DebitCard> debitCardList) {
		this.debitCardList = debitCardList;
	}
	
}
