package com.demo.test;

import com.demo.beans.MyStorage;
import com.demo.thread.Consumer;
import com.demo.thread.Producer;

public class TestProducerConsumer {
	public static void main(String[] args) {
		MyStorage st=new MyStorage();
		Producer p=new Producer(st);
		p.start();
		Consumer c=new Consumer(st);
		c.start();
		
	}

}
