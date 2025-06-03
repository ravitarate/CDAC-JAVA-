package com.demo.test;

import java.util.stream.Stream;

import com.demo.enums.Cofee;

public class TestEnumCoffee {

	public static void main(String[] args) {
		Cofee c=Cofee.medium;
		System.out.println("small :" +c.ordinal());
		Stream.of(c.values()).forEach(System.out::println);
		switch(c) {
		case small:
			System.out.println("you selected small-->size:  "+c.getSize()+" price : "+c.getPrice());
			break;
		case medium:
			System.out.println("you selected medium -->size:"+c.getSize()+" price : "+c.getPrice());
		case large:
			System.out.println("you selected large -->size:"+c.getSize()+" price : "+c.getPrice());
		}

	}

}
