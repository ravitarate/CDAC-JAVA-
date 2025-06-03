package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao edao;
	public EmployeeServiceImpl() {
		edao=new EmployeeDaoImpl();
	}
	@Override
	public void readFile() {
		edao.readDataFromFile();
		
	}
	@Override
	public List<Employee> getAllEmployee() {
		return edao.findAllEmployees();
	}
	@Override
	public boolean addNewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr empno");
		int empno=sc.nextInt();
		System.out.println("enetr name");
		String nm=sc.next();
		System.out.println("enetr salary");
		double s=sc.nextDouble();
		Employee emp=new Employee(empno,nm,s);
		return edao.save(emp);
	}
	@Override
	public void writeToFile() {
		edao.writrDataToFile();
		
	}
	@Override
	public boolean deleteById(int eno) {
		return edao.removeById(eno);
	}

}
