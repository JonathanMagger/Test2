package com.tes;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Date3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc = new Scanner(System.in);


	    int n = sc.nextInt();

	    ArrayList arr[] = new ArrayList[n];


	    for(int i=0;i<n;i++)
	    {
	        int size = sc.nextInt();
	        arr[i] = new ArrayList();

	        for(int j=0;j<size;j++)
	        {
	            arr[i].add(sc.nextInt());
	        }
	        
	    }
      

	    int q = sc.nextInt();
        System.out.println();
        System.out.println();
	    for(int i=0;i<q;i++)
	    {
	        int x = sc.nextInt();
	        int y = sc.nextInt();

	        try
	        {
	            System.out.println(arr[x-1].get(y-1));
	        }
	        catch(Exception e)
	        {
	            System.out.println("ERROR!");
	        }
	    }


	        sc.close();
	    }
	
	

	}