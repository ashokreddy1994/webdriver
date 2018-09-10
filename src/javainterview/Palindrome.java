package javainterview;

public class Palindrome {

	public static void main(String[] args) {
          /*  int n=353;
            int temp=n;
            int rev=0;
            while(n>0) {
            	rev=rev*10+n%10;
            	n=n/10;
            }
            System.out.println(rev);
            if(temp==rev) {
            	System.out.println("given number is palindrome");
            }
            else
            	System.out.println("not palindrome");*/
		
		
		String s="adiida";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
		if(reverse.equals(s)) {
			System.out.println("palindrome");
	}

}}
