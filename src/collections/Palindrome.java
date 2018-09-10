package collections;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
              String original,reverse="";
              Scanner s=new Scanner(System.in);
                 original=s.nextLine();//565
                 int size=original.length();//3
                 for(int i=size-1;i>=0;i--){
                	 reverse=reverse+original.charAt(i);
                	
                 }
                 if(original.equals(reverse))
            		 System.out.println("given number is palindrome");
            	 
            	 else
            		 System.out.println("the given number is not palindrome");
	}

}
