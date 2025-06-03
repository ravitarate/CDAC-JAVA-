package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestCRUDDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		EmployeeService eservice=new EmployeeServiceImpl();
		eservice.readFile();
		do {
		System.out.println("1. Add new employee \n 2. delete employee");
		System.out.println("3.display all\n4.exit\n choice :");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			boolean status=eservice.addNewEmployee();
			if(status) {
				System.out.println("added successfully");
			}else {
				System.out.println("error occured");
			}
			break;
		case 2:
			System.out.println("enter empno");
			int eno=sc.nextInt();
			status=eservice.deleteById(eno);
			if(status) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("not found");
			}
			break;
		case 3:
			List<Employee> elst=eservice.getAllEmployee();
			elst.forEach(System.out::println);
			break;
		case 4:
			eservice.writeToFile();
			sc.close();
			System.out.println("Thank you for visiting....");
			break;
		default:
			System.out.println("wrong choice");
			
		}
		}while(choice!=4);
		
		
	}

}
