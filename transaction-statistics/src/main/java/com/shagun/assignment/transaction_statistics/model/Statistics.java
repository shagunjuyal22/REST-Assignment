package com.shagun.assignment.transaction_statistics.model;


public class Statistics {
	
	private double sum;
	private double avg;
	private double max;
	private double min;
	private long count;
	
	
	
	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

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
        return "Statistic Response is{" +
                "sum=" + sum +
                ", avg=" + avg +
                ", max=" + max +
                ", min=" + min +
                ", count=" + count +
                '}';
    }
	
	@Override
	public boolean equals(Object o) {
		Statistics stat = (Statistics)o;
		if(o== null || this == null)
			return false;
		if(getClass() != o.getClass())
			return false;
		return Double.compare(this.avg, stat.avg) ==0
				&& Double.compare(this.min, stat.min) ==0
				&& Double.compare(this.max, stat.max) ==0
				&& Double.compare(this.sum, stat.sum) ==0
				&& Double.compare(this.count ,stat.count) ==0;
		
	}
	
	@Override
	public int hashCode() {
        int result = 17;
        result = 31 * result + (int)this.avg;
        result = 31 * result + (int)this.count;
        result = 31 * result + (int)this.max;
        	result = 31 * result + (int)this.min;
        	result = 31 * result + (int)this.sum;
        return result;
    }
	
	
	

}
