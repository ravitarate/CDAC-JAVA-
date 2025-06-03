package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void readDataFromFile();

	List<Employee> findAllEmployees();

	boolean save(Employee emp);

	void writrDataToFile();

	boolean removeById(int eno);

}
