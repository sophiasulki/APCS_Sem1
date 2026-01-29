/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String b = sc.nextLine();
		if(b.equals("Wizard")||b.equals("wizard")){
			System.out.println("You have chosen the Wizard! Excelsior!");
		}
		if(b.equals("Warrior")||b.equals("warrior")){
			System.out.println("You have chosen the Warrior! For honor!");
		}
		if(b.equals("Rogue")||b.equals("rogue")){
			System.out.println("You have chosen the Rogue! How cunning!");
		}
		else{
			System.out.println("You've decided not to choose a role. Rerun program.");
		}
	}
}
