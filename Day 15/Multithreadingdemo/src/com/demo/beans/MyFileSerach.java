package com.demo.beans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileSerach {
     public void search(String word) {
    	 try(BufferedReader br=new BufferedReader(new FileReader("Myfile"));){
    		 String s=br.readLine();
    		 boolean flag=false;
    		 while(s!=null) {
    			 Thread.sleep(300);
    			  if(!s.equals(word)) {
    				  s=br.readLine(); 
    			  }else {
    				  flag=true;
    				  break;
    			  }
    			  
    		 }
    		 if(flag)
    			 System.out.println("Found  "+word);
    		 else
    			 System.out.println("Not found "+word);
    		 
    	 } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     }
}
