package com.shagun.assignment.transaction_statistics.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.Response.StatusType;

import com.shagun.assignment.transaction_statistics.model.Transaction;
import com.shagun.assignment.transaction_statistics.service.TransactionService;
import com.shagun.assignment.transaction_statistics.service.impl.TransactionServiceImpl;

@Path("/transactions")
public class TransactionResource {
	
	
	TransactionService transactionService = new TransactionServiceImpl();
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addTransaction(Transaction transaction) {
		
		boolean trxAccepted = transactionService.addTransaction(transaction);
		if(trxAccepted) {
			return Response.status(201).type("application/json").entity("{}").build();
		}
		else
			return Response.status(204).type("application/json").entity("{}").build();
	}
	


}
