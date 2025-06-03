package com.demo.thread;

import com.demo.beans.MyClass;

public class MyFactorialThread extends Thread{
	private MyClass ob;
	private int n;
	
     public MyFactorialThread(MyClass ob, int n) {
		super();
		this.ob = ob;
		this.n = n;
	}

	public void run() {
    	 System.out.println("Factorial : "+ob.factorial(n));
     }
}
