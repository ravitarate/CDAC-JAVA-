package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployeeMgnt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice=0;
		do {
			
		System.out.println("1.Add new employee\n2.Delete Employee\n3.Modify Employee");
		System.out.println("4.display by id\n5.display by name\n6.display all");
		System.out.println("7.display in sorted order by name\n8.Display in sorted order by id\n9.exit\n choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("1. Salaried\n2.Contract");
			int ch=sc.nextInt();
			boolean status=eservice.addNewEmployee(ch);
			if(status) { //status==true
				System.out.println("added successfully");
			}else {
				System.out.println("error occured");
			}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			System.out.println("enetr id");
			String id=sc.next();
			Employee e=eservice.getById(id);
			if(e!=null) {
				System.out.println(e);
			}else {
				System.out.println("not found");
			}
			break;
		case 5:
			break;
		case 6:
			List<Employee> elst=eservice.getAll();
			elst.forEach(ob->{System.out.println(ob);});
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			sc.close();
			System.out.println("Thank you for visiting.....");
			break;
		default:
			System.out.println("Wring choice....");
			break;
		}
		}while(choice!=9);

	}

}
