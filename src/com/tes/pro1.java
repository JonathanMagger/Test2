package com.tes;

public class pro1 {
pro1(){
	System.out.println("constructor");
}
void m1() {
	System.out.println("method1");
}
void m2() {
	System.out.println("method2");
}
void m3() {
	System.out.println("method3");
}
	public static void main(String[] args) {
		
		pro1 p = new pro1();
		pro1 d = new pro1();
		p.m1();
		p.m2();
		d.m3();
		

	}

}
