package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestappendData {

	public static void main(String[] args) {
		FileOutputStream fos=null;
	try {
		File f=new File("myfilecopy.txt");
		
		if(f.exists()) {
			//open file in append mode
		  fos=new FileOutputStream(f,true);
		  
		}else {
		  fos=new FileOutputStream(f);	
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try(FileInputStream fis=new FileInputStream("myfile.txt");
		FileOutputStream fos1=fos;) {
		int i=fis.read();
		while(i!=-1) {
			fos.write(i);
			i=fis.read();
		}
		
	}catch(IOException e)  {
		e.printStackTrace();
	}
	
	
	
}

}
