/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		String sent1 = sc.nextLine();
		System.out.println("Write a sentence!");
		String sent2 = sc.nextLine();
		System.out.println();
		System.out.println("This is using the methods!");
		toString(sent1);
		toStringCombined(sent1, sent2);
		
	}
	public static void toString(String a){
		System.out.println(a);
	}
	public static void toStringCombined(String a, String b){
		System.out.print(a + " " + b);
	}
}
