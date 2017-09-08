package com.anz.banking.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Transaction {
	
	private int transactionId;
	private int amount;
	@Autowired 
	@Qualifier("dc")
	private DebitCard debitCard;
	
	
	public Transaction(int transactionId, int amount) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
	}
	public void setDebitCard(DebitCard debitCard) {
		this.debitCard = debitCard;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public int getAmount() {
		return amount;
	}
	public DebitCard getDebitCard() {
		return debitCard;
	}
	

}
