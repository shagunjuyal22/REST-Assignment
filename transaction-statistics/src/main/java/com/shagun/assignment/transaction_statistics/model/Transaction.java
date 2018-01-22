package com.shagun.assignment.transaction_statistics.model;

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
	
	@Override
	public String toString() {
		return ("Transaction Object is {"+
							"amount=" + this.amount+
							", timestamp is=" +this.timestamp + "}");
		
	}
	
	@Override
	public boolean equals(Object o) {
		Transaction trx = (Transaction)o;
		if(o== null || this == null)
			return false;
		if(getClass() != o.getClass())
			return false;
		return Double.compare(this.amount, trx.amount) ==0
				&& Long.compare(this.timestamp, trx.timestamp) ==0;	

		
	}
	
	@Override
	public int hashCode() {
        int result = 17;
        result = 31 * result + (int)this.amount;
        result = 31 * result + this.timestamp.intValue();
        
        return result;
    }
	

}
