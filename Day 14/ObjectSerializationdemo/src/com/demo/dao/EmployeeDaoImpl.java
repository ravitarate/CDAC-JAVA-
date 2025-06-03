package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static List<Employee> elist;
	static {
		elist=new ArrayList<>();
		//elist.add(new Employee(100,"Arti",56788));
		//elist.add(new Employee(101,"Ashutosh",96788));
		//elist.add(new Employee(102,"Rashmi",86788));
	}
	@Override
	public void readDataFromFile() {
		File f=new File("empdata.txt");
		if(f.exists()) {
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("empdata.txt"));){
				try {
				while(true){
					Employee e=(Employee)ois.readObject();
					elist.add(e);
				}}catch(EOFException e) {
					System.out.println("reached to end of file");
				}
			} catch (FileNotFoundException e) {
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
	@Override
	public List<Employee> findAllEmployees() {
		return elist;
	}
	@Override
	public boolean save(Employee emp) {
		elist.add(emp);
		return true;
	}
	@Override
	public void writrDataToFile() {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("empdata.txt"));){
			for(Employee e:elist) {
				oos.writeObject(e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public boolean removeById(int eno) {
		return elist.remove(new Employee(eno));
	}
	
	

}
