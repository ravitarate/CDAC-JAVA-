package com.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) {
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream("myfile.txt"));
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("myfilecopy.txt"));){
			int i=bis.read();
			while(i!=-1) {
				bos.write(i);
				i=bis.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
