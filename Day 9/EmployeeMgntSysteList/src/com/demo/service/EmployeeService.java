package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee(int ch);

	List<Employee> getAll();

	Employee getById(String id);

	List<Employee> getByName(String nm);

	boolean deleteById(String id);

	boolean modifyById(String id, double sal);

	boolean deleteBySalary(double sal);

	List<Employee> sortById();

}
