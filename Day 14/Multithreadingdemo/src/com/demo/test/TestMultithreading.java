package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.thread.MyPrinttableThread;

public class TestMultithreading {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		MyPrinttableThread th1=new MyPrinttableThread(7, ob);
		th1.start(); //it calls run method
		MyPrinttableThread th2=new MyPrinttableThread(3, ob);
	    th2.start();
		System.out.println("Factorial : "+ob.factorial(5));

	}

}
