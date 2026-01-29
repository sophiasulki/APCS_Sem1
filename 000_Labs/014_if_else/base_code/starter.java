/*
 *	Author:  
 *  Date: 
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
		else{
			System.out.println("Your number wasn't the random number. The number was "+num);
		}
	}
}
