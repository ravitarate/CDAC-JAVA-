package com.demo.thread;

import java.util.concurrent.Callable;

public class MyTask implements Callable<Integer>{
	private int start,end;
	

	public MyTask(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}


	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum+=i;
		}
		System.out.println(" Id : "+Thread.currentThread().getId()+"Start: "+start+"end : "+end+"-->"+sum);
		return sum;
	}

}
