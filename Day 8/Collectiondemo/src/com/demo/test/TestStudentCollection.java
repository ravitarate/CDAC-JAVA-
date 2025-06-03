package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;

public class TestStudentCollection {

	public static void main(String[] args) {
		List<Student> slist=new ArrayList<>();
		slist.add(new Student(1,"Rajan","Baner"));
		slist.add(new Student(2,"Anil","Baner"));
		slist.add(new Student(3,"Ashu","Kothrud"));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter studentid to search");
		int id=sc.nextInt();
		int pos=slist.indexOf(new Student(id));
		if(pos!=-1) {
			System.out.println("found"+slist.get(pos));
		}else {
			System.out.println("Not found");
		}
		System.out.println(slist.contains(new Student(3)));
		System.out.println("delete "+slist.remove(new Student(2)));

	}

}
