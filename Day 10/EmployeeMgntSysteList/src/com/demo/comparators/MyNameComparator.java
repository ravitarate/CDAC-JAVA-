package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Employee;

public class MyNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("in name compare function "+o1.getPname()+"----"+o2.getPname());
		return o1.getPname().compareTo(o2.getPname());
	}

}
