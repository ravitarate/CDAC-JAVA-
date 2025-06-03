package com.demo.beans;

import com.demo.interfaces.Interface1;
import com.demo.interfaces.Interface2;

public class MyClass implements Interface1,Interface2{

	public void m21() {
		System.out.println("in m21");
	}

	@Override
	public void m11() {
		System.out.println("in m11");
		
	}

	@Override
	public int m12() {
		System.out.println("in m12");
		return 10;
	}

}
