package com.shagun.assignment.transaction_statistics.service.impl;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.shagun.assignment.transaction_statistics.model.Transaction;


public class TransactionServiceImplTest {
private TransactionServiceImpl transactionServiceImpl;
	
	@Before
	public void init() {
		transactionServiceImpl = new TransactionServiceImpl();
	}
	
	@Test
	public void addTransaction_WithinExpectedTimeTest() {
		double amount = 30.5;
		Transaction trx = new Transaction(amount ,java.lang.System.currentTimeMillis());
		transactionServiceImpl.addTransaction(trx);
		Assert.assertEquals(String.valueOf(1),String.valueOf(TransactionServiceImpl.trxMap.size()));
	}
	
	@Test
	public void addTransaction_WithExpiredTimeStampTest() {
		double amount = 30.5;
		Transaction trx = new Transaction(amount ,java.lang.System.currentTimeMillis() - 61000);
		transactionServiceImpl.addTransaction(trx);
		Assert.assertEquals(String.valueOf(0),String.valueOf(TransactionServiceImpl.trxMap.size()));
	}
	
	@After
	public void tearDowm() {
		System.out.println("Test execution done");
	}

	
	
}
