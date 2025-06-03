package com.demo.beans;

public class MyStorage {
	private int n;
	private boolean valueflag;
	
	
	public MyStorage() {
		super();
		this.n = 0;
		this.valueflag = false;
	}
	synchronized public void put(int num) {
		if(valueflag) { //valueflag==true
		    try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		n=num;
		valueflag=true;
		System.out.println("Put : "+n);
		notify();
		
	}
	synchronized public void get() {
		if(!valueflag) {//valueflag==false
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("get: "+n);
		valueflag=false;
		notify();
	}

}
