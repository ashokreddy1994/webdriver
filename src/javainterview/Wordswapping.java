package javainterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Wordswapping {

	public static void main(String[] args) {
          //  String s="ashokreddy singareddy";
//            String s1=s.substring(11);
//           
//            String s2=s.substring(0,11);
//           
//            System.out.println(s1+" "+s2);
//            String input = "how is this";
//            List<String> words = Arrays.asList(input.split(" "));
//            Collections.reverse(words);
//            String result = "";
//            for(String word : words) {
//                if(!result.isEmpty()) {
//                    result += " ";
//                }
//                result += word;
//            }
//            System.out.println(result);
//            
		String s="welcome cognizant";
		String rev[]=s.split(" ");
		for(int i=rev.length-1;i>=0;i--) {
			System.out.print(rev[i]+" ");
		}
	}

}
