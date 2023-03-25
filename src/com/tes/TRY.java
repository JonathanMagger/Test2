package com.tes;

import java.util.Scanner;


public class TRY {
	
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int [n];
        int b=0;
        
        for (int i = 0; i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i = 0; i<n; i++){
            for (int j=i+1 ; j<n; j++){
                 int c = a[i]+a[j];
                 System.out.println(c);
                 if (c<0) {
                	 b++;
                 }
                }
            } System.out.println(b);
        }
        
    }
