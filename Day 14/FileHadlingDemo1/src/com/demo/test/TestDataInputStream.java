package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataInputStream {

	public static void main(String[] args) {
		try (DataOutputStream dos=new DataOutputStream(new FileOutputStream("mydata.txt"));
			 DataInputStream dis=new DataInputStream(new FileInputStream("mydata.txt"))){
			dos.writeInt(1234);
			dos.writeUTF("Rajan");
			dos.writeDouble(3456.78);
			//reading data
			System.out.println("Integer : "+dis.readInt());
			System.out.println("String : "+dis.readUTF());
			System.out.println("Double : "+dis.readDouble());
			dos.writeDouble(3456.78);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
