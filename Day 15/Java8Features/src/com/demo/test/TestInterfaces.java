package com.demo.test;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestInterfaces {
	public static void main(String[] args) {
		Integer[] arr= {12,13,14,15,2,3,415};
		//IntPredicate p=num->num%2==0;
		List<Integer> ilist=Stream.of(arr).filter(num->num%2==0).collect(Collectors.toList());
		System.out.println(ilist);
		Integer[] arr1= {12,13,14,15,2,3,415};
		List<Integer> ilist1=Stream.of(arr1).map(num->num*num).collect(Collectors.toList());
		Stream.of(arr1).forEach(num ->System.out.println(num));
		
		System.out.println(Stream.of(arr1).anyMatch(num->num%2==0));
		System.out.println(Stream.of(arr1).allMatch(num->num%2==0));
		System.out.println(Stream.of(arr1).noneMatch(num->num%2==0));
		
	}

}
