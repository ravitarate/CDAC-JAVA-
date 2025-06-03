package com.demo.test;

import com.demo.interfaces.Interface2;
import com.demo.interfaces.Interface3;
import com.demo.interfaces.MyGenericInterface;
import com.demo.interfaces.MyInterface;

public class TestGenericInterface {

	public static void main(String[] args) {
		Interface2 ob=(x,y)->x>y?x:y;
		System.out.println(ob.compare(12,34));
		
		Interface3 ob1=(x,y)->x.length()>y.length()?x.length():y.length();
		System.out.println(ob1.compare("Hello","Welcome"));
		
		MyInterface<String, Integer> a=(x,y)->x.length()>y.length()?x.length():y.length();
		
		System.out.println(a.compare("Hello", "welcome"));
		
		MyInterface<Integer, Integer> b=(x,y)->x>y?x:y;
		
		System.out.println(b.compare(22,33));
		
		MyGenericInterface<Integer> mg1=(x,y,arr)->{
			int s=x+y;
			for(int a1:arr) {
				s+=a1;
			}
			return s;
					
		};
		System.out.println("Addition of Integers :"+mg1.add(1, 2, 23,4,5,6,7));
		
		MyGenericInterface<String> mg2=(x,y,arr)->{
			String s=x+y;
			for(String a1:arr) {
				s+=a1;
			}
			return s;
					
		};
		System.out.println("Concatenated Strings are:"+mg2.add("aa","bb","ccc","dd","ee"));
		
		
	}

}
