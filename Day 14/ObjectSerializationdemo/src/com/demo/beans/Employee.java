package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable{
	public Employee(int empno) {
		super();
		this.empno = empno;
	}
	private int empno;
	private String ename;
	private double sal;
	public Employee() {
		super();
	}
	public Employee(int empno, String ename, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	public boolean equals(Object obj) {
		return this.empno==((Employee)obj).empno;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	

}
