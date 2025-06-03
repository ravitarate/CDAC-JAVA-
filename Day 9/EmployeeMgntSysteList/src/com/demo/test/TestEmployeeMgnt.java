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
			
		System.out.println("1.Add new employee\n2.Delete Employee by id\n3.Modify Employee");
		System.out.println("4.display by id\n5.display by name\n6.display all");
		System.out.println("7.display in sorted order by name\n8.Display in sorted order by id\n9. delete by salary\n10.exit\n choice");
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
			System.out.println("enetr id to delete");
			String id=sc.next();
			status=eservice.deleteById(id);
			if(status) {
				System.out.println("deleted successfully");
			}else {
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("enter id for modify");
			id=sc.next();
			System.out.println("enter salary");
			double sal=sc.nextDouble();
			status=eservice.modifyById(id,sal);
			if(status) {
				System.out.println("modified successfully");
			}else {
				System.out.println("not found");
			}
			break;
		case 4:
			System.out.println("enetr id");
			id=sc.next();
			Employee e=eservice.getById(id);
			if(e!=null) {
				System.out.println(e);
			}else {
				System.out.println("not found");
			}
			break;
		case 5:
			sc.nextLine();
			System.out.println("enter name");
			String nm=sc.nextLine();
			List<Employee> elst=eservice.getByName(nm);
			if(elst!=null)
				elst.forEach(ob->{System.out.println(ob);});
			else 
				System.out.println("not found");
			break;
		case 6:
			elst=eservice.getAll();
			elst.forEach(ob->{System.out.println(ob);});
			break;
		case 7:
			break;
		case 8:
			 elst=eservice.sortById();
			 elst.forEach(System.out::println);
			break;
		case 9:
			System.out.println("enter salary for deleting employees");
			sal=sc.nextDouble();
			status=eservice.deleteBySalary(sal);
			if(status)
				System.out.println("employees deleted : ");
			else
				System.out.println("not found");
					
			break;
		case 10:
			sc.close();
			System.out.println("Thank you for visiting.....");
			break;
		default:
			System.out.println("Wring choice....");
			break;
		}
		}while(choice!=10);

	}

}
