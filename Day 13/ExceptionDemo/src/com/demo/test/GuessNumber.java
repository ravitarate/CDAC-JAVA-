package com.demo.test;
import java.util.Scanner;

import com.demo.exceptions.WrongNumberException;

public class GuessNumber {

	public static void main(String[] args) {
		int n=45;
		Scanner sc=new Scanner(System.in);
		int num=0;
		
		while(true) {
			try {
				System.out.println("Guess the number");
				num=sc.nextInt();
				if(num!=n) {
					throw new WrongNumberException("OOPs, you lost one attempt");
				}else {
					System.out.println("YePeee, You guess it right");
					break;
				}
			}catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}catch(WrongNumberException e) {
				System.out.println(e.getMessage());
			}
		}
	
			
		

	}

}
