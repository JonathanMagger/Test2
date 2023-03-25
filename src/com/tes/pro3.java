package com.tes;

import java.util.Scanner;

public class pro3 {
	public static void main(String args[]) { 
		 @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		 String word = s.nextLine();
		 System.out.println(getreverse(word));
	}

	private static String getreverse(String word) {
		// TODO Auto-generated method stub
		return getreverse(word.substring(0, word.length() - 1));
	}
}
