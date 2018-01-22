package com.shagun.assignment.transaction_statistics.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shagun.assignment.transaction_statistics.model.Statistics;
import com.shagun.assignment.transaction_statistics.model.Transaction;
import com.shagun.assignment.transaction_statistics.service.StatisticsService;
import com.shagun.assignment.transaction_statistics.service.TransactionService;

@Path("/transactions")
public class TransactionResource {
	
	TransactionService transactionService = new TransactionService();
	StatisticsService statisticsService = new StatisticsService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Transaction> getAllTrx() {
		return transactionService.getAllTrx();
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void addTransaction(Transaction transaction) {
		transactionService.addTransaction(transaction);
		
	}
	


}
