package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.demo.thread.MyTask;

public class TestExecutorService {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(4);
		List<Future<Integer>> flist=new ArrayList<>();
		for(int i=1;i<=91;i=i+10) {
			MyTask t1=new MyTask(i,i+9);
			Future<Integer> f=es.submit(t1);
			flist.add(f);
		}
		int finalsum=0;
		for(Future<Integer> f1:flist) {
			try {
				finalsum+=f1.get();
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Final addition : "+finalsum);
		try {
			es.awaitTermination(300, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
