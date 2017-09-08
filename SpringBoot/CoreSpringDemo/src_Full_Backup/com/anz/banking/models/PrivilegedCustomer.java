package com.anz.banking.models;

public class PrivilegedCustomer extends Customer{
	
	private String rmContactNo;
	private float discount;
	public String getRmContactNo() {
		return rmContactNo;
	}
	public void setRmContactNo(String rmContactNo) {
		this.rmContactNo = rmContactNo;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	

}
