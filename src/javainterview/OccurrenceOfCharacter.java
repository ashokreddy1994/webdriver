package javainterview;

import java.util.HashMap;

public class OccurrenceOfCharacter {

	public static void main(String[] args) {
                 String s="asshokk";
                 int counter=0;
                 for(int i=0;i<s.length();i++) {
                	 counter=0;
                	 for(int j=0;j<s.length();j++)
                	 {
                		 if(s.charAt(i)==s.charAt(j))
                		 {
                			 counter=counter+1;
                		 }
                	 }
                	 System.out.println("the occurrence of "+s.charAt(i)+counter);
                 }
		 
			}

}
