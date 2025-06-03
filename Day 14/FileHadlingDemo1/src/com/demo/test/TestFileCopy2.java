package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileCopy2 {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("myfile.txt");
			FileOutputStream fos=new FileOutputStream("myfilecopy.txt")) {
			int i=fis.read();
			while(i!=-1) {
				fos.write(i);
				i=fis.read();
			}
			System.out.println("file copied");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
