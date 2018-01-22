package com.shagun.assignment.transaction_statistics.resource;

import java.util.Optional;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shagun.assignment.transaction_statistics.model.Statistics;
import com.shagun.assignment.transaction_statistics.service.StatisticsService;
import com.shagun.assignment.transaction_statistics.service.impl.StatisticsServiceImpl;


@Path("/statistics")
public class StatisticsResource {
	
	
	StatisticsService statisticsService = new StatisticsServiceImpl();
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Statistics getStatistics() {
		
		return statisticsService.getStatistics();
		
	}


}
