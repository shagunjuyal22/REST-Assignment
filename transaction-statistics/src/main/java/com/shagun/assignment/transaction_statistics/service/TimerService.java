package com.shagun.assignment.transaction_statistics.service;

import java.util.Queue;
import java.util.TimerTask;

public class TimerService {//extends TimerTask{

	/*@Override
	public void run() {
		Queue<Long> timeStampQueue = StatisticsService.timeStampQueue;
		
		Long currentTimeStamp = java.lang.System.currentTimeMillis();
		System.out.println("TimerService started at" + currentTimeStamp);
		
		for(int i=0 ;i < timeStampQueue.size();i++)
		{
			if((currentTimeStamp - timeStampQueue.peek()) > 60) {
				timeStampQueue.poll();
			}
			else
				return;
		}
		System.out.println("TimerService ended ");
		
	}*/

}
