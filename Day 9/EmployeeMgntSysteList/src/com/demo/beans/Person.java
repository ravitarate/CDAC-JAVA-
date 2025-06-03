package com.demo.beans;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person>{
	static int count;
	static {
		count=0;
	}
	private String pid;
	private String pname;
	private Date doj;
	public Person() {
		//calls parametrised constructor of same class
		this("s",null,null);
		//System.out.println("in person default constructor");
		//this.pid = generateCode("s");
		//this.pname =null;
		//this.doj = null;
		
	}
	public Person(String type, String pname, Date doj) {
		//System.out.println("in person parametrised constructor");
		this.pid = generateCode(type);
		this.pname = pname;
		this.doj = doj;
	}
	public Person(String id) {
		super();
		this.pid=id;
		
	}
	public boolean equals(Object obj) {
		Person p=(Person)obj;
		System.out.println("equals in person "+this.pid+"-----"+p.pid);
		return this.pid.equals(p.pid);
	}
	private String generateCode(String type) {
		count++;
		return type+count;
	}
	public String getPid() {
		return pid;
	}
	//no setter method for pid will make it readonly
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		String dt=sdf.format(doj);
		return "Person [pid=" + pid + ", pname=" + pname + ", doj=" + dt+ "]";
	}
	@Override
	public int compareTo(Person o) {
//		if(this.pid<o.pid)
//			return -1;
//		else if(this.pid==o.pid)
//			return 0;
//		else
//			return 1;
		System.out.println("In comparable "+this.pid+"---"+o.pid);
		return this.pid.compareTo(o.pid);
				
	}
	
	
	
	

}
