package com.demo.enums;

public enum Cofee {
	small(150,200),medium(200,300),large(250,350);
	private int size;
	private double price;
	private Cofee(int size, double price) {
		System.out.println("constructor called "+size+"-----"+price);
		this.size = size;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	

}
