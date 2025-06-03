package com.demo.beans;

public class MyClass {
	public void printTable(int n) {
		for(int i=1;i<10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
	}
	
	public int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
