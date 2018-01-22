package com.shagun.assignment.transaction_statistics.service.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.shagun.assignment.transaction_statistics.model.Transaction;
import com.shagun.assignment.transaction_statistics.service.TransactionService;

import java.sql.Timestamp;

public class TransactionServiceImpl implements TransactionService{
	
	
	public static Map<Timestamp, Transaction> trxMap = new ConcurrentHashMap<Timestamp, Transaction>() ;


	public boolean addTransaction(Transaction transaction) {
		System.out.println("Transaction time is" + new Timestamp(transaction.getTimestamp()).toInstant());
		if((java.lang.System.currentTimeMillis() - transaction.getTimestamp() <= 60000)) {
			trxMap.put(new Timestamp(transaction.getTimestamp()), transaction);
			return true;
			
		}
		else
			return false;
		
	}

}
