package com.demo.test;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.demo.beans.Employee;

public class ConverterProgram {

	public static void main(String[] args) {
		String s1="a";
		s1=null;
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("empdata.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("myemp.csv"));	){
			while(true) {
				Employee e=(Employee)ois.readObject();
				bw.write(e.getEmpno()+","+e.getEname()+","+e.getSal()+"\n");
			}
			
		} catch(EOFException e) {
			System.out.println("Reached to end of file");
		} catch(FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
