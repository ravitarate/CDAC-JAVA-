package com.demo.test;

import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		System.out.println("Capacity : "+v.capacity());
		v.add(12);
		v.add(45);
		//v.add("hello");
		v.add(45);
		System.out.println(v);
		System.out.println("Capacity : "+v.capacity());
		System.out.println("size : "+v.size());
		for(int i=0;i<10;i++) {
			v.add(23+i);
		}
		System.out.println(v);
		System.out.println("Capacity : "+v.capacity());
		System.out.println("size : "+v.size());
		for(int i=0;i<10;i++) {
			v.add(23+i);
		}
		System.out.println(v);
		System.out.println("Capacity : "+v.capacity());
		System.out.println("size : "+v.size());
		
	}

}
