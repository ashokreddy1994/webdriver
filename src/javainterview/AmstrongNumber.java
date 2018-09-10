package javainterview;

public class AmstrongNumber {

	public static void main(String[] args) {
           int n=153;
           int temp =n;
           int c=0;
           while(n>0) {
        	   int a=n%10;
        	   n=n/10;
        	  c=c+(a*a*a);
           }
           if(temp==c) {
        	   System.out.println("number is amstrognumber");
           }
           else
           {
        	   System.out.println("it is not amstrongnumber");
           }
	}

}
