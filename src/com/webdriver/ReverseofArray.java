package com.webdriver;

public class ReverseofArray {

	public static void main(String[] args) {
     int a[]={3,5,7,2};
     int large=a[0];
     int small=a[0];
     for(int i=1;i<a.length;i++){
    	 if(a[i]>large){
    		 large=a[i];
    	 }
    	 else if(a[i]<small){
    		 small=a[i];
    	 }
    	 
     }
     System.out.println(large);
     System.out.println(small);
	}

}
