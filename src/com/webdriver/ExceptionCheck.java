package com.webdriver;

public class ExceptionCheck {

	public static void main(String[] args) {
        try{
        	int a,b,c;
        	a=10;
        	b=0;
        	c=a/b;
        } 
        catch(ArithmeticException e){
        	e.printStackTrace();
        	System.out.println(e.toString());
        	System.out.println("sss");
        }
        catch(Exception e){
        	
        }
        
      
       /* finally{
        	System.out.println("reddy");
        }*/
        System.out.println("ashok");
	}

}
