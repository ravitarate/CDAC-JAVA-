package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyFileSerach;
import com.demo.thread.SearchThread;

public class TestSearchWord {
	public static void main(String[] args) {
		MyFileSerach fs=new MyFileSerach();
		String[] words= {"Happy","Joy","check","xxxx","rrrr","Laugh","dfdfgdg","Joy","ccccc","Help"};
		SearchThread[] sth=new SearchThread[10];
		Thread[] tharr=new Thread[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			//System.out.println("enetr word for searching");
			//String s/=sc.next();
			sth[i]=new SearchThread(fs, words[i]);
			tharr[i]=new Thread(sth[i]);
			tharr[i].start();
		}
	}
	

}
