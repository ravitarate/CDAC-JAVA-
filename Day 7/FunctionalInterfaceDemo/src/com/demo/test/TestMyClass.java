package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.interfaces.MyFunctionalInterface;

public class TestMyClass {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		ob.m1(12,13);
		
		//annonymous class
		MyFunctionalInterface if1=new MyFunctionalInterface() {
			
			@Override
			public void m1(int x, int y) {
				System.out.println("in m1 function in annonymous class");
				
			}
		};
		if1.m1(11,22);
		//java 1.8
		MyFunctionalInterface if2=(x,y)->{
			System.out.println("in lambda function m1"+x+"  "+y);
		};
		if2.m1(111,222);
		

	}

}
