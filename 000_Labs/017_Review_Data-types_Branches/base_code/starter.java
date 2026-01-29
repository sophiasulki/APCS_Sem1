/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String title = sc.nextLine();
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue?");
		String b = sc.nextLine();
		if(b.equals("Wizard")||b.equals("wizard")){
			System.out.println("You have chosen the Wizard! Excelsior!");
		}
		else if(b.equals("Warrior")||b.equals("warrior")){
			System.out.println("You have chosen the Warrior! For honor!");
		}
		else if(b.equals("Rogue")||b.equals("rogue")){
			System.out.println("You have chosen the Rogue! How cunning!");
		}
		else{
			System.out.println("You've decided not to choose a role. Rerun program.");
		}
		
		System.out.println();
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.println();
		
		System.out.print("Strength (1-10): ");
		int one = sc.nextInt();
		if(one>10){
			System.out.print("Please input a smaller value. Strength (1-10): ");
			one = sc.nextInt();
		}
		System.out.println("You have "+(20-one)+" left to spend.");
		System.out.println();
		
		System.out.print("Dexterity (1-10): ");
		int two = sc.nextInt();
		if(two>10){
			System.out.print("Please input a smaller value. Dexterity (1-10): ");
			two = sc.nextInt();
		}
		System.out.println("You have "+(20-one-two)+" left to spend.");
		System.out.println();
		
		System.out.print("Intelligence (1-10): ");
		int three = sc.nextInt();
		if(three>10){
			System.out.print("Please input a smaller value. Intelligence (1-10): ");
			three = sc.nextInt();
		}
		System.out.println("You have "+(20-one-two-three)+" left to spend.");
		System.out.println();
		
		System.out.print("Charisma (1-10): ");
		int four = sc.nextInt();
		if(four>10){
			System.out.print("Please input a smaller value. Charisma (1-10): ");
			four = sc.nextInt();
		}
		System.out.println("You have "+(20-one-two-three-four)+" left to spend.");
		System.out.println();
		
		System.out.println("---------------------------------------------");
		System.out.println("You are "+name+", the "+title+" of CVHS");
		System.out.println("You are a "+b+" with the following stats!");
		System.out.println("Strength - "+one+"\nDexteriry - "+two+"\nIntelligence - "+three+"\nCharisma - "+four);
		System.out.println();
		System.out.println("Good luck on your quest "+name+"!");
	}
}
