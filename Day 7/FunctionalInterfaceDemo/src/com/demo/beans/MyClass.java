package com.demo.beans;

import com.demo.interfaces.MyFunctionalInterface;

public class MyClass implements MyFunctionalInterface{

	@Override
	public void m1(int x, int y) {
		System.out.println("in m1 method from myclass");
		
	}

}
