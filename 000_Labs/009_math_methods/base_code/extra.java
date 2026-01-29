/*
 *	Author:  Sophia kim
 *  Date: 9.3.25
*/

import java.util.Scanner;

class extra {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter x");
		int x = sc.nextInt();
		
		System.out.println("enter y");
		int y = sc.nextInt();
		
		System.out.println("max(x,y)="+Math.max(x,y));
		
		System.out.println("sqrt(y)="+Math.sqrt(y));
		
		System.out.println("pow(x,y)="+Math.pow(x,y));
	}
}