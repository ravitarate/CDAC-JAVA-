package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void readFile();

	List<Employee> getAllEmployee();

	boolean addNewEmployee();

	void writeToFile();

	boolean deleteById(int eno);

}
