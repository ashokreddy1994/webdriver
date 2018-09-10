package javainterview;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
                 int[] a= {3,9,4,1,4,-3};
                 for(int i=0;i<a.length;i++) {
                	 System.out.println(a[i]);
                 }
                 Arrays.sort(a);
                 for(int b:a) {
                	 System.out.print(b+" ");
                 }
	}

}
