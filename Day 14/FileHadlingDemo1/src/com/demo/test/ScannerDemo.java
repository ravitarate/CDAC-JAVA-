package com.demo.test;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner("this is testing");
		String s=sc.next();
		try {
		while(s!=null) {
		 System.out.println(s);
		 s=sc.next();
		}
		}catch(NoSuchElementException e) {
			System.out.println("reached to end......");
		}
	}

}
