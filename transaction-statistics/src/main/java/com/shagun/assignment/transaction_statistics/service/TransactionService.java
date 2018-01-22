package com.shagun.assignment.transaction_statistics.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.shagun.assignment.transaction_statistics.model.Transaction;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;

public class TransactionService {
	
	private static List<Transaction> transactionList = new ArrayList<>();
	public static Map<Timestamp, Transaction> trxMap = new ConcurrentHashMap<Timestamp, Transaction>() ;
	
	/*public TransactionService(){
		transactionList.add(new Transaction(20.5 ,1516486874978L));
	}*/
	
	
	public List<Transaction> getAllTrx(){
		return transactionList;
	}


	public void addTransaction(Transaction transaction) {
		System.out.println("Transaction time is" + new Timestamp(transaction.getTimestamp()).toInstant());
		//Long diff = java.lang.System.currentTimeMillis() - transaction.getTimestamp();
		//System.out.println("Diff between curre TS and trx TS is"+ diff);
		if((java.lang.System.currentTimeMillis() - transaction.getTimestamp() <= 60000)) {
			System.out.println("Trx added");
			trxMap.put(new Timestamp(transaction.getTimestamp()), transaction);
			
		}
		
	}

}
