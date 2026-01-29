/*
 *	Author:  Sophia Kim
 *  Date: 9.9.25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first number: "); 
		int num = sc.nextInt();
		System.out.println("");
		
		System.out.print("Please enter your second number: ");
		int num1 = sc.nextInt();
		
		boolean x = num!=num1;
		String z = ("The variables are different!");
		if(x){
			System.out.println(z);
		}
		else{
			System.out.println("The variables are the same!");
		}
	}
}
