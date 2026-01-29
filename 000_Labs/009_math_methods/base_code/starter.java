/*
 *	Author:  Sophia kim
 *  Date: 9.3.25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int ear = Math.max(13 - 6 * 11, 30 % 7 * (-2));
		System.out.println("Maximum = "+ear);
		double nose = Math.sqrt(3 * 8 + 31 % 7);
		System.out.println("Square Root = "+nose);
		double mouth = Math.pow(37 / 3, 35 % 21);
		System.out.println("Power = "+mouth);
		
		double eye1 = Math.pow(2,14%3);
		double eye2 = Math.sqrt(2*6);
		System.out.println("Max = "+Math.max(eye1, eye2));
	}
}
