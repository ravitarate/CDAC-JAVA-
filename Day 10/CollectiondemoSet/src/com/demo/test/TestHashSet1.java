package com.demo.test;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet1 {

	public static void main(String[] args) {
		Set<String> hs=new HashSet<>();
		hs.add("Happy");
		hs.add("joy");
		hs.add("happy");
		hs.add("joy");
		System.out.println(hs);
		System.out.println(hs.remove("happy"));
		System.out.println(hs);
	}

}
