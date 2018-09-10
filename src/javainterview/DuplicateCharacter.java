package javainterview;

public class DuplicateCharacter{

	public static void main(String[] args) {
                   String s="asshokk";
                   char ch[]=s.toCharArray();
                   for(int i=0;i<ch.length;i++) {
                	   for(int j=i+1;j<ch.length;j++) {
                		   if(s.charAt(i)==s.charAt(j)) {
                			   System.out.println(s.charAt(i));
                			   
                		   }
                	   }
                   }
	}

}
