package com.anz.banking.models;

import java.util.Date;

public class DebitCard {
private String cardNo;
private int debitLimit;
private Date expiryDate;
private int balance;
private String cvv;

public String getCardNo() {
	return cardNo;
}
public void setCardNo(String cardNo) {
	this.cardNo = cardNo;
}
public int getDebitLimit() {
	return debitLimit;
}
public void setDebitLimit(int debitLimit) {
	this.debitLimit = debitLimit;
}
public Date getExpiryDate() {
	return expiryDate;
}
public void setExpiryDate(Date expiryDate) {
	this.expiryDate = expiryDate;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public String getCvv() {
	return cvv;
}
public void setCvv(String cvv) {
	this.cvv = cvv;
}

}
