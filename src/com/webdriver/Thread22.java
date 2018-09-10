package com.webdriver;

public class Thread22 extends Thread{
	public void run(){  
		  for(int i=1;i<5;i++){  
		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
		  Thread22 t1=new Thread22();  
		  Thread22 t2=new Thread22();  
		   
		  t1.start();  
		  t1.start();  

}}
