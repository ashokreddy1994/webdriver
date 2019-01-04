package javainterview;

public class DuplicateArrayElements {
	static int a=10;
	static {
		System.out.println("ccc");
	}
	public static void m1() {
		System.out.println("bbb");
	}

	public static void main(String[] args) {
		System.out.println("aaa");
		//DuplicateArrayElements d=new DuplicateArrayElements();
		m1();
	}
	
          /* int a[] = {2,3,4,3,5,5};
           for(int i=0;i<a.length;i++) {
        	   for(int j=i+1;j<a.length;j++) {
        		   if(a[i]==a[j ]) {
        			   System.out.println(a[i ]);
        		   }
        	   }
           }*/
		/*String s1="AAA";
		String s2="AAA";
		String s3=new String("AAA");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		*/
	}


