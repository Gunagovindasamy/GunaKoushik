package org.prep;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1;
		for (int i = 0; i <=10; i++) {
			
			int c=a+b;
			//if(c<=100) {
				a=b;
				b=c;
				System.out.println(c);
			//}
	
		}
		
	}
	

}
