package com.demo.test;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		SortedSet<Integer> numset=new TreeSet<>();
		numset.add(30);
		numset.add(11);
		numset.add(145);
		numset.add(15);
		numset.add(78);
		System.out.println(numset);
		SortedSet<Integer> hset=numset.headSet(30);
		SortedSet<Integer> tset=numset.tailSet(30);
		System.out.println("head set "+hset);
		System.out.println("tail set "+tset);
		numset.add(17);
		numset.add(80);
		System.out.println("head set "+hset);
		System.out.println("tail set "+tset);
		
	}

}
