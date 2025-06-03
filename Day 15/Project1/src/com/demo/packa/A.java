package com.demo.packa;

import com.demo.packb.B;

public class A {
	private int id;

	private String name;
	public A() {
		super();
	}
	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "A [id=" + id + ", name=" + name + "]";
	}
	public void m1() {
		B b1=new B("xxxx");
		System.out.println(b1);
		System.out.println("in m1 method");
	}

}
