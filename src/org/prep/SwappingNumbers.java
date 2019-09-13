package org.prep;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the numbers");
		int d = sc.nextInt();
		int e = sc.nextInt();
		c=d;
		d=e;
		e=c;
		System.out.println("swapping numbers are");
		System.out.println(d);
		System.out.println(e);
		
		
		
		
	}

}
