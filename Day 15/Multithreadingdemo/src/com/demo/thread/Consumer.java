package com.demo.thread;

import com.demo.beans.MyStorage;

public class Consumer extends Thread{
	private MyStorage st;
	
 public Consumer(MyStorage st) {
		super();
		this.st = st;
	}

public void run() {
	    for(int i=0;i<10;i++) {
			
			st.get();
		}
 }
}
