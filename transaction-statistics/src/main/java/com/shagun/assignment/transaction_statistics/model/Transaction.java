package com.shagun.assignment.transaction_statistics.model;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Transaction {
	
	private double amount;
	private Long timestamp;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	public Transaction(double amount, Long timestamp) {
		super();
		this.amount = amount;
		this.timestamp = timestamp;
	}
	
	public Transaction() {}
	

}
