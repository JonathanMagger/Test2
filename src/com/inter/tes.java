package com.inter;

public class tes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		for(i=0;i<5;i++) {
			for(j=5; j>i;j--) {
				System.out.print("*");
			}
			for(j=0; j<=i;j++) {
				System.out.print("-");
			}
			for(j=0; j<i;j++) {
				System.out.print("-");
			}
			for(j=5; j>i;j--) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
	}

}
