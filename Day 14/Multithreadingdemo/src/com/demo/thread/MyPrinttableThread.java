package com.demo.thread;

import com.demo.beans.MyClass;

public class MyPrinttableThread extends Thread{
	private int num;
	private MyClass ob;
	public MyPrinttableThread(int n,MyClass ob) {
		this.num=n;
		this.ob=ob;
	}
	
	public void run() {
		ob.printTable(num);
	}

}
