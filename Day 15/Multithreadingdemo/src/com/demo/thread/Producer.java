package com.demo.thread;

import com.demo.beans.MyStorage;

public class Producer extends Thread {
	private MyStorage st;
	
	
	public Producer(MyStorage st) {
		super();
		this.st = st;
	}


	public void run() {
		for(int i=0;i<10;i++) {
			st.put(i);
			
		}
	}

}
