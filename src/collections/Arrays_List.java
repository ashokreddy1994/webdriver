package collections;

import java.util.Arrays;

public class Arrays_List {

	public static void main(String[] args) {
           int[] a={87,23,12,60};
           int[] b={90,87,90};
           System.out.println(Arrays.equals(a, b));
            String s1= Arrays.toString(a);
            System.out.println(s1);
            Arrays.sort(a);
            String s2=Arrays.toString(a);
            System.out.println(s2);
	}

}
