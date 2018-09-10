package javainterview;

public class HighestNumberAnarray {

	public static void main(String[] args) {
               int a[] = {3,5,9,6};
               int high=a[0];
               int low=a[0];
               for(int i=0;i<a.length;i++) {
            	   if(a[i]>high) {
            		  high=a[i];
            	   }
            	   else if(a[i]<low) {
            		   low=a[i];
                      	   }
               }
               System.out.println(high);
               System.out.println(low);
	}

}
