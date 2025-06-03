package com.demo.test;

public class TestArray {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,12};
		try {
			for(int i=0;i<=arr.length;i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
