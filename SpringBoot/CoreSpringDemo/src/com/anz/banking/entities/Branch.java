package com.anz.banking.entities;

import org.springframework.stereotype.Component;

@Component(value="branchInstance")
public class Branch {
	private String branchID;
	private String address;
	private String phoneNo;
	public String getBranchID() {
		return branchID;
	}
	public void setBranchID(String branchID) {
		this.branchID = branchID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
