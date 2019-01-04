package javainterview;

public class StringExp {

	public static void main(String[] args) {
             String s="ashok";
//             String s1="ashok";
//             System.out.println(s.equals(s1)); //true
//             System.out.println(s==s1); //true
//             String s2=new String("ashok").intern();
//             
//             System.out.println(s.equals(s2)); //true
//             System.out.println(s==s2);  //false
             StringExp p=new StringExp();
             System.out.println(p.hashCode());
             System.out.println(s.toString());
	}

}
