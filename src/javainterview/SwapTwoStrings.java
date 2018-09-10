package javainterview;

public class SwapTwoStrings {

	public static void main(String[] args) {
            String a="ashok";
            String b="reddy";
           a=a+b;// ashokreddy
           b=a.substring(0,a.length()-b.length());
           a=a.substring(b.length());
           System.out.println(a);
           System.out.println(b);
            
	}

}
