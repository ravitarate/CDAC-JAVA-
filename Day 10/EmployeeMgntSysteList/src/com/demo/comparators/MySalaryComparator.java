package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class MySalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		double s1=0,s2=0;
		if(o1 instanceof SalariedEmp) {
			s1=((SalariedEmp)o1).getSal();
		}else if(o1 instanceof ContractEmp){
			s1=((ContractEmp)o1).getcharges();
		}
		if(o2 instanceof SalariedEmp) {
			s2=((SalariedEmp)o2).getSal();
		}else if(o2 instanceof ContractEmp){
			s2=((ContractEmp)o2).getcharges();
		}
		/*if(s1<s2) {
			return -1;
		}
		else if(s1==s2)
			return 0;
		else
			return 1;
				
		}*/
		return (int)(s1-s2);
		
		
	}

}
