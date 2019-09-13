package org.prep;

import java.util.Scanner;

public class SwappingWithoutThirdVariable {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int d = sc.nextInt();
		int e = sc.nextInt();
		d=d+e;
		e=d-e;
		
		d=d-e;
		System.out.println(d);
		System.out.println(e);
	}

}
