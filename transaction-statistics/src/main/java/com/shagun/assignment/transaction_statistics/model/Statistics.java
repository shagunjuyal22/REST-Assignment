package com.shagun.assignment.transaction_statistics.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Statistics {
	
	private double sum;
	private double avg;
	private double max;
	private double min;
	private long count;
	
	public Statistics(double sum, double avg, double max, double min, long count) {
		super();
		this.sum = sum;
		this.avg = avg;
		this.max = max;
		this.min = min;
		this.count = count;
	}
	
	@Override
    public String toString() {
        return "TransactionStatisticResponse{" +
                "sum=" + sum +
                ", avg=" + avg +
                ", max=" + max +
                ", min=" + min +
                ", count=" + count +
                '}';
    }
	
	
	

}
