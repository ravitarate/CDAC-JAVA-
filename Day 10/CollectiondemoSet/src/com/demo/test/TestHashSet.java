package com.demo.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		Set<Integer> hs=new HashSet<>();
		hs.add(34);
		hs.add(23);
		hs.add(1);
		System.out.println(hs);
		if(!hs.add(23)) {
			System.out.println("duplicate value");
		}else {
			System.out.println("data added");
		}
		System.out.println(hs);
		for(int v:hs) {
			System.out.println(v);
		}
		Iterator<Integer> it =hs.iterator();
		while(it.hasNext()) {
			Integer n =it.next();
			System.out.println(n);
		}
		
		hs.forEach(e->{System.out.print(e+",");});
		

		

}
}
