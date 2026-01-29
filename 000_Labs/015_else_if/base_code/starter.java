/*
 *	Author:  Sophia Kim
 *  Date: 9.5.25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random()*999+1);
		System.out.print("Pick a number between 1-1000: ");
		int a = sc.nextInt();
		
		if(a==num){
			System.out.println("You guessed the right number! The number was "+num);
		}
		if(a>num){
			System.out.println("Your number was greater than the number. The number was "+num);
		}
		if(a<num){
			System.out.println("Your number was smaller than the number. The number was "+num);
		}
	}
}
