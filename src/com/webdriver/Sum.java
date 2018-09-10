package com.webdriver;

public class Sum {

	public static void main(String[] args) {
          /*  int n=12345;
            int sum=0;
            for(int i=0;i<=5;i++) {
            	sum=sum+i;
            }
            System.out.println(sum);*/
		int n=123;
		int sum=0;
		while(n>0) {
			int temp=n%10;//3 2
			sum=sum+temp;//3 5
			n=n/10;//12 1
		}
		System.out.println(sum);
		System.out.println(1%10);
		System.out.println(1/10);
	}

}
