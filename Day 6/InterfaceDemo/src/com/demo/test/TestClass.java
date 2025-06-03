package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.interfaces.Interface1;
import com.demo.interfaces.Interface2;

public class TestClass {
	public static void main(String[] args) {
		Interface1 ob=new MyClass();
		((MyClass)ob).m21();
		Interface2 ob2=new MyClass();
		ob2.m21();
		//ob2.m12();
		System.out.println(Interface1.myvar);
		//Interface1.myvar=34;
	}

}
