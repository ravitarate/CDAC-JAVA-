package com.demo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.comparators.MyNameComparator;
import com.demo.comparators.MySalaryComparator;

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
	@Override
	public List<Employee> findByName(String nm) {
		/*List<Employee> elst=new ArrayList<>();
		for(Employee e:elist) {
			if(e.getPname().equals(nm)) {
				elst.add(e);
			}
		}*/
		List<Employee> elst=elist.stream()
				            .filter(e->e.getPname().equals(nm))
				            .collect(Collectors.toList());
		if(elst.size()>0) {
			return elst;
		}
		return null;
	}
	@Override
	public boolean removeById(String id) {
		//java 1.7
		/*Iterator<Employee> it=elist.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			if(e.getPid().equals(id)) {
				//it will delete the object currently read by next function
				it.remove();
				return true;
			}
		}
		return false;*/
		//java 1.8 
		if(id.startsWith("s"))
		  return elist.remove(new SalariedEmp(id));
		else
		  return elist.remove(new ContractEmp(id)); 	
		
		
		
	}
	@Override
	public boolean updateById(String id, double sal) {
		Employee e=findById(id);
		if(e!=null) {
			if(e instanceof SalariedEmp) {
				((SalariedEmp) e).setSal(sal);
			}else if(e instanceof ContractEmp) {
				((ContractEmp) e).setCharges(sal);
			}else {
				//code for vendor goes here
			}
			return true;
			
		}
		return false;
	}
	@Override
	public boolean removeBySal(double sal) {
		//java 1.7
		/*Iterator<Employee> it=elist.iterator();
		int count=0;
		while(it.hasNext()) {
			Employee e=it.next();
			if(e instanceof SalariedEmp){
				if(((SalariedEmp)e).getSal()>sal)
					it.remove();
				    count++;
			}else if(e instanceof ContractEmp) {
				if(((ContractEmp)e).getcharges()>sal) {
					it.remove();
					count++;
				}
			}
		}
		return count;*/
		return elist.removeIf(e->{
			if(e instanceof SalariedEmp) {
				
				return ((SalariedEmp) e).getSal()>sal;
				
			}else if(e instanceof ContractEmp) {
				return ((ContractEmp) e).getcharges()>sal;
			}
			
			return false;
		});
	}
	@Override
	public List<Employee> arrangeById() {
		//create copy of the elist
		 List<Employee> elist1=new ArrayList<>();
		 for(Employee e:elist) {
			 elist1.add(e);
		 }
		 elist1.sort(null);
		 return elist1;
	}
	@Override
	public List<Employee> arrangeByName() {
		List<Employee> elist1=new ArrayList<>();
		 for(Employee e:elist) {
			 elist1.add(e);
		 }
		 elist1.sort(new MyNameComparator());
		 return elist1;
	}
	@Override
	public List<Employee> arrangeBySal() {
		List<Employee> elist1=new ArrayList<>();
		 for(Employee e:elist) {
			 elist1.add(e);
		 }
		 elist1.sort(new MySalaryComparator());
		 return elist1;
	}
	
	
}
