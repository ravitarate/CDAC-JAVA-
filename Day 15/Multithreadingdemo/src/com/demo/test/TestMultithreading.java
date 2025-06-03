package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.thread.MyFactorialThread;
import com.demo.thread.MyPrinttableThread;

public class TestMultithreading {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		
		MyPrinttableThread th1=new MyPrinttableThread(7, ob);
		th1.start(); //it calls run method
		th1.setPriority(Thread.NORM_PRIORITY+2);
		MyPrinttableThread th2=new MyPrinttableThread(3, ob);
	    th2.start();
	    MyFactorialThread fth=new MyFactorialThread(ob, 5);
	    fth.start();
	    
	    try {
			th1.join(300);
			th2.join();
		    fth.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    System.out.println("main method continues");
		

	}

}
