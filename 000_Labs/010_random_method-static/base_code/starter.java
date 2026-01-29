/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int x = (int)(Math.random() * 10);
		System.out.println("A number between 0-9: "+x);
		int a = (int)(Math.random() * 11+1);
		System.out.println("A number between 1-10: "+a);
		double b = (Math.random()+2.5);
		System.out.println("A number between 2.5-3.5: "+b);
		double c = (Math.random()*575+14);
		System.out.println("A number between 14-589: "+c);
	}
}
