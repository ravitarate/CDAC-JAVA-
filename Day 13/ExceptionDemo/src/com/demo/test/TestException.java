package com.demo.test;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
	private static int divide(int a, int b) {
		try {
		   int ans=a/b;
		    return ans;
		}catch(ArithmeticException e) {
			System.out.println("number cannot be zero in divide catch block");
			throw e;
		}
		//return 0;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
		try {
			System.out.println("enterr number");
			int a=sc.nextInt(); 
			System.out.println("enterr number");
			int b=sc.nextInt();
			int ans=a+b;
			System.out.println("Addition : "+ans);
			int ans1=divide(a,b);
			
			System.out.println("Division : "+ans1);
			break;
						
		}catch(InputMismatchException e) {
			System.out.println("pls enter numeric value");
			//e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("value of second number can not be zero in main try block");
		}catch(Exception e) {
			System.out.println("error ocured : "+e.getMessage());
		}finally {
			System.out.println("in finally block");
		}
		}//end for
		System.out.println("after try, resume main program");
	}

	

}
