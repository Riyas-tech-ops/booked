package org.test;

import java.util.Scanner;

public class EvenNot {
	private void check(int n) {
		
		if (n %2 !=0) {
	    	 System.out.println("this number not even:"+n);
			
		}else {
			System.out.println("this number is not valid :"+n);
		}

	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Type Your Number");
		int n = s.nextInt();
		
		EvenNot ev = new EvenNot();
		ev.check(n);
	     
		

	}

}
