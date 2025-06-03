package com.demo.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReader {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new FileReader("employee.txt"));){
			String data=br.readLine();
			double sum=0;
			while(data!=null) {
				String[] tokens=data.split(",");
				sum+=Double.parseDouble(tokens[3]);
				System.out.println(tokens[0]+": "+tokens[1]+"---->"+tokens[3]);
				data=br.readLine();
			}
			System.out.println("------------------------");
			System.out.println("Total : "+sum);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
