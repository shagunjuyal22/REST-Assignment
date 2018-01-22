package com.shagun.assignment.transaction_statistics.service.impl;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.shagun.assignment.transaction_statistics.model.Statistics;
import com.shagun.assignment.transaction_statistics.model.Transaction;
import com.shagun.assignment.transaction_statistics.service.StatisticsService;
import com.shagun.assignment.transaction_statistics.service.TransactionService;

public class StatisticsServiceImplTest {
	
	private static StatisticsService statisticsService;
	private static TransactionService transactionService;
	
	@BeforeClass
	public static void init() {
		statisticsService = new StatisticsServiceImpl();
		transactionService = new TransactionServiceImpl();
		addTrx();
		
	}
	

	private static void addTrx() {

		Transaction trx1 = new Transaction(30.5 ,java.lang.System.currentTimeMillis());
		Transaction trx2 = new Transaction(20.5, java.lang.System.currentTimeMillis() + 10000);
		Transaction trx3 = new Transaction(20.5, java.lang.System.currentTimeMillis() - 61000);
		
		transactionService.addTransaction(trx1);
		transactionService.addTransaction(trx2);
		transactionService.addTransaction(trx3);
		
	}


	@Test
	public void getStatisticsTest() {
		
		Statistics statistics = statisticsService.getStatistics();
		Assert.assertEquals(String.valueOf(2),String.valueOf(statistics.getCount()));
		Assert.assertEquals(String.valueOf(20.5),String.valueOf(statistics.getMin()));
	}
	
	
	@AfterClass
	public static void tearDowm() {
		System.out.println("Test execution done");
	}

}
