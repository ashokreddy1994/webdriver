package com.webdriver;

public class Duplicate {

	public static void main(String[] args) {
          String[] a={"ashok","java","reddy","ashok"};
          for(int i=0;i<=a.length;i++){
        	  for(int j=i+1;i<a.length;j++){
        		  if(a[i].equals(a[j])){
        			  System.out.println("the duplicate values are"+a[i]);
        		  }
        		  else {
        			  System.out.println("the unique elements"+a[j]);
        		  }
        			  
        	  }
          }
	}

}
