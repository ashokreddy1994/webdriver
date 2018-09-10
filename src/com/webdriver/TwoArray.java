package com.webdriver;

public class TwoArray {

	public static void main(String[] args) {
		int[][] a={{1,3},{4,6},{7,8}};
		System.out.println(a.length);
 		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i].length);
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
