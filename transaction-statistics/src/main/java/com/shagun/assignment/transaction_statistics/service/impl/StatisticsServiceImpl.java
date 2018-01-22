package com.shagun.assignment.transaction_statistics.service.impl;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.DoubleSummaryStatistics;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.shagun.assignment.transaction_statistics.model.Statistics;
import com.shagun.assignment.transaction_statistics.model.Transaction;
import com.shagun.assignment.transaction_statistics.service.StatisticsService;

public class StatisticsServiceImpl implements StatisticsService{

	public Statistics getStatistics() {
		
		System.out.println("CurrentTime is:"+ Instant.now());
		
		 Map<Timestamp, Transaction> trxMap = TransactionServiceImpl.trxMap;
		 DoubleSummaryStatistics summaryStatistics = trxMap.entrySet().parallelStream()
		 .filter(map -> map.getKey().toInstant().plusSeconds(60).isAfter(Instant.now()))
		 .map(Map.Entry::getValue)
		 .collect(Collectors.summarizingDouble(Transaction::getAmount));
		 
		 if(trxMap.isEmpty()) {
			 return null;	            
	        }
		 else {
			 return new Statistics(summaryStatistics.getSum(), summaryStatistics.getAverage(),
                 summaryStatistics.getMax(), summaryStatistics.getMin(), summaryStatistics.getCount());
		 }
		 
		
	}

	
}
