package com.demo.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> myq=new PriorityQueue<>();
		myq.add(23);
		myq.add(12);
		myq.add(50);
		myq.add(20);
		myq.add(11);
		//to see values in the queue
		for(Integer i:myq) {
			System.out.println(i);
		}
		System.out.println("---using peek function");
		System.out.println(myq.peek());
		System.out.println(myq.peek());
		System.out.println("----------");
		while(!myq.isEmpty()){
			System.out.println(myq.poll());
		}
		

	}

}
