package com.demo.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



import com.demo.beans.MyClass;

public class TestMyClass {

	public static void main(String[] args) {
		MyClass ob=new MyClass(12,"Rohan");
		Class cls=ob.getClass();
		Constructor[] carr=cls.getConstructors();
		for(Constructor c11:carr) {
			System.out.println("Name : "+c11.getName());
			System.out.println("Parametercount:" +c11.getParameterCount());
			
		}
		Method[] marr=cls.getMethods();
		for(Method m:marr) {
			System.out.println("Method name "+m.getName());
			System.out.println("parameters : "+m.getParameterCount());
			if(m.getName().startsWith("get")) {
				try {
					System.out.println("Name : "+m.getName()+"anaswers :"+m.invoke(ob));
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		Field[] farr= cls.getDeclaredFields();
		for(Field f:farr) {
			System.out.println(f.getName());
			
			
		}
		//make private members accessible
	    farr[0].setAccessible(true);
	    farr[1].setAccessible(true);
	    //changing value of private fields
	    try {
			farr[0].set(ob, 23);
			System.out.println(ob);
			farr[1].set(ob, "Kedar");
			System.out.println(ob);
			//MyClass ob1=new MyClass();
			
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
