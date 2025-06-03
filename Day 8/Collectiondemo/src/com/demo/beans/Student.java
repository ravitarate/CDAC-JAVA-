package com.demo.beans;

public class Student {
	private int sid;
	private String sname;
	private String addr;
	public Student() {
		super();
	}
	public Student(int sid, String sname, String addr) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.addr = addr;
	}
	public Student(int sid) {
		super();
		this.sid = sid;
	}
	
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + sid;
//		return result;
//	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("in student equals method  "+this.sid+"   "+((Student)obj).sid);
		return this.sid==((Student)obj).sid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", addr=" + addr + "]";
	}
	
	

}
