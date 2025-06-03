package com.demo.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class TestList {

	public static void main(String[] args) {
		List<String> lst=Arrays.asList("Python","Perl","Linux");
		System.out.println(lst);
		//lst.add("DBMS"); //error
		System.out.println("position: "+lst.indexOf("Perl"));
		
		List<Integer> ilist=List.of(12, 13,1,2,3,19,45,34,5);
		Set<Integer> iset=Set.of(34,45,67);
		System.out.println("MAximum: "+Collections.max(ilist));
		System.out.println("Minimum: "+Collections.min(ilist));
		List<Integer> ilist1=new ArrayList<>();
		for(int i=1;i<=6;i++) {
		ilist1.add(i);
		}
		for(int i=0;i<5;i++) {
			Collections.shuffle(ilist1);
			System.out.println(ilist1);
		}

	}

}
