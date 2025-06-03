package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAll();

	Employee findById(String id);

	List<Employee> findByName(String nm);

	boolean removeById(String id);

	boolean updateById(String id, double sal);

	boolean removeBySal(double sal);

	List<Employee> arrangeById();

}
