package com.tes;

public class pro4 {

	final int a;
	
	pro4(){
		this.a = 10;
		System.out.println("constructor 1");
	}

	public static void main(String[] args) {
		pro4 pp = new pro4();
		int b = 12 + pp.a;
		System.out.println(b);
	}
}
