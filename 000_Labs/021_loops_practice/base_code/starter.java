/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("Please a number between 1-1000: ");
			int x = sc.nextInt();
			if(x==627){
				System.out.println("You got the number! Congrats!");
				break;
			}
			if(x<627){
				System.out.println("Your number was too low, guess again.");
			}
			if(x>627){
				System.out.println("Your number was too high, guess again.");
			}
		}
	}
}
