package com.demo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmployeeDaoImpl implements EmployeeDao{
	static List<Employee> elist; 
	static {
		elist=new ArrayList<>();
		elist.add(new SalariedEmp("Kavita",new Date(),"Hr","mgr",34252));
		elist.add(new SalariedEmp("Rahul",new Date(),"Admin","Associate",23435));
		elist.add(new ContractEmp("Ashu",new Date(),"Admin","mgr",23,34252));
		elist.add(new ContractEmp("Pallavi",new Date(),"Admin","Associate",51,23435));
	}
	@Override
	public boolean save(Employee e) {
		elist.add(e);
		return true;
	}
	@Override
	public List<Employee> findAll() {
		return elist;
	}
	@Override
	public Employee findById(String id) {
		int pos=-1;
		if(id.startsWith("s")) {
		   pos=elist.indexOf(new SalariedEmp(id));
		}
		else {
			 pos=elist.indexOf(new ContractEmp(id));
		}
		if(pos!=-1)
			return elist.get(pos);
		else
			return null;
	}
	
	
}
