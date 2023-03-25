package com.tes;

class recursi{
	 int factorial(int n) {
	    if (n == 0) {
	        return 1;
	    }
	    return  factorial(n-1);
	}
}
public class tesand {
	
	public static void main (String[]args) {
		
		recursi obj = new recursi();
		System.out.println(obj.factorial(5));
	}
}
