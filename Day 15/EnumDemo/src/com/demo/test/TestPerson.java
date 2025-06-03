package com.demo.test;

import com.demo.beans.Person;
import com.demo.enums.Gender;

public class TestPerson {

	public static void main(String[] args) {
		Person p=new Person(12,"Sushrut",Gender.male);
		System.out.println(p);

	}

}
