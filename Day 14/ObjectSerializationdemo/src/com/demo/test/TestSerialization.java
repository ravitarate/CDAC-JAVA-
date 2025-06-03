package com.demo.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class TestSerialization {

	public static void main(String[] args) {
		Employee[] earr= {
				new Employee(10,"Savita",4444),
				new Employee(11,"Vidya",5555),
				new Employee(23,"Makarand",77777)
				
		};
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("empdata.txt"));
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("empdata.txt"));){
			for(Employee e:earr) {
				oos.writeObject(e);
			}
			System.out.println("file is ready");
			List<Employee> elist=new ArrayList<>();
			try {
			   while(true) {
			    Employee e=(Employee)ois.readObject();
			    elist.add(e);
			    System.out.println(e);
			   }
			}catch(EOFException e) {
				System.out.println("Reached to end of the file");
			}
			System.out.println("-------------------");
			System.out.println(elist);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
