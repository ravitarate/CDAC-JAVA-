package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;


public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao edao;
	//to create EmployeeDao object
	public EmployeeServiceImpl() {
		edao=new EmployeeDaoImpl();
	}
	@Override
	public boolean addNewEmployee(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String nm=sc.nextLine();
		System.out.println("enter doj (dd/mm/yyyy)");
		String dt=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Date doj=null;
		try {
		doj=sdf.parse(dt);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println("Enter dept");
		String dept=sc.next();
		System.out.println("enter desg");
		String desg=sc.next();
		Employee e=null;
		if(ch==1) {
			System.out.println("enter salary");
			double sal=sc.nextDouble();
			 e=new SalariedEmp(nm, doj, dept, desg, sal);
			
		}else {
			System.out.println("enetr charges");
			double charges=sc.nextDouble();
			System.out.println("enetr hrs");
			int h=sc.nextInt();
			e=new ContractEmp(nm, doj, dept, desg,h,charges);
			
		}
		return edao.save(e);
	}
	@Override
	public List<Employee> getAll() {
		return edao.findAll();
	}
	@Override
	public Employee getById(String id) {
		return edao.findById(id);
	}
	@Override
	public List<Employee> getByName(String nm) {
		return edao.findByName(nm);
	}
	@Override
	public boolean deleteById(String id) {
		return edao.removeById(id);
	}
	@Override
	public boolean modifyById(String id, double sal) {
		return edao.updateById(id,sal);
	}
	@Override
	public boolean deleteBySalary(double sal) {
		return edao.removeBySal(sal);
	}
	@Override
	public List<Employee> sortById() {
		return edao.arrangeById();
	}

}
