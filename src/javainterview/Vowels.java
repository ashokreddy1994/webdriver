package javainterview;

public class Vowels {

	public static void main(String[] args) {
                    String s="ashok";
                    for(int i=0;i<s.length();i++) {
                    	char ch=s.charAt(i);
                    	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                    		System.out.println(s.charAt(i));
                    	}
                    	//else System.out.println(s.charAt(i));
                    }
	}

}
