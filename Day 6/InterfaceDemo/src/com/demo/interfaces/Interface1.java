package com.demo.interfaces;

public interface Interface1 {
	void m11();
	int m12();
	default void m13() {
		System.out.println("in m13 method");
	}
	private void f1() {
		System.out.println("in f1 private method");
	}
	static void f2() {
		System.out.println("in static method f2");
	} 
	int myvar=45;
	

}
