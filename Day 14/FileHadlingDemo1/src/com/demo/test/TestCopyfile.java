package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyfile {
  public static void main(String[] args) {
	  FileInputStream fis=null;
	  FileOutputStream fos=null;
	try {
		//File myfile.txt should exists,
		//It will open file for reading purpose
		fis=new FileInputStream("myfile.txt");
		///if file doesnot exists, it will create it, otherwise ovewrite it
		//It will open file writing purpose
		fos=new FileOutputStream("myfilecopy.txt");
		//it will read one byte at a time
		int i=fis.read();
		while(i!=-1) {
			fos.write(i);
			i=fis.read();
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			if(fis!=null)
				fis.close();
			if(fos!=null)
				fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
}
