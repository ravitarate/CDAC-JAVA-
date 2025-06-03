package com.demo.test;

import java.util.Vector;

public class TestVectorDemo2 {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector();
		v.add(20);
		v.add(30);
		v.add(40);
		System.out.println(v);
		//To find whether number 30 exists
		int pos=v.indexOf(30); //it checks wether 2 object are equal
		v.remove(pos);
		v.remove(new Integer(30));
		//print values
		for(int i=0;i<v.size();i++) {
			//get will retrieve the value at i index position
			System.out.print(v.get(i)+",");
		}
		//it will take us to new line
		System.out.println();
		//java 1.7
		for(int value:v) { //we cannot modify vector v
			System.out.print(value+",");
			
		}
		System.out.println();
		//java 1.8
		//v.forEach(ob->{System.out.print(ob+",");});
		
		//:: operator is method resolution operator
		v.forEach(System.out::print);
		

	}

}
