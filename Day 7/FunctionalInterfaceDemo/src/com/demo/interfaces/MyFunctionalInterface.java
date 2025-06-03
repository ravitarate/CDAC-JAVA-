package com.demo.interfaces;

@FunctionalInterface
public interface MyFunctionalInterface {
	void m1(int x, int y);
	default void m2() {
		m5();
		System.out.println("in m2 default method");
	}
	default void m3() {
		m5();
		System.out.println("in m3 default method");
	}
	
	static void m4() {
		m5();
		System.out.println("in m4 static method");
	}
	private static void m5() {
		System.out.println("in m5 private method ");
	}

}
