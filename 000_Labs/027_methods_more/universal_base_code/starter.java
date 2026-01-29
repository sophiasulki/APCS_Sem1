/*
 *	Author:  Sophia Kim
 *  Date: 10.24.25
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BankAccount z = new BankAccount();
		System.out.println("Welcome to the ATM!\nWe're going to create a bank account! What info do we know?\n1 - Nothing\n2 - Owner\n3 - Owner and Initial Deposit");
		String know = sc.nextLine();
		if(know.equals("1")){
			System.out.println("");
			System.out.println("Account successfully created!\n");
			System.out.println("--- Account Info ---\n");
			z.displayAccountInfo();
			System.out.println("\nWould you like to check your balance of this account? (yes/no)");
			String check = sc.nextLine();
			if(check.equals("yes")){
				z.checkBalance();
				System.out.println("\nThank you for coming to the ATM!");
			}
			if(check.equals("no")){
				System.out.println("\nGreat! No balance checked.");
				System.out.println("Thank you for coming to the ATM!");
			}
		}
		if(know.equals("2")){
			System.out.println("\nWhat is the name of the owner of this bank account?");
			String name = sc.nextLine();
			BankAccount y = new BankAccount(name);
			System.out.println("\n--- Account Info ---");
			y.displayAccountInfo();
			System.out.println("\nWould you like to check your balance of this account? (yes/no)");
			String check = sc.nextLine();
			if(check.equals("yes")){
				y.checkBalance();
				System.out.println("\nThank you for coming to the ATM!");
			}
			if(check.equals("no")){
				System.out.println("Great! No balance checked.");
				System.out.println("\nThank you for coming to the ATM!");
			}
		}
		if(know.equals("3")){
			System.out.println("\nWhat is the name of the owner of this bank account?");
			String name = sc.nextLine();
			System.out.println("How much are you initially depositing into this bank account?");
			int depo = sc.nextInt();
			sc.nextLine();
			BankAccount x = new BankAccount(name, depo);
			System.out.println("\n--- Account Info ---");
			x.displayAccountInfo();
			System.out.println("\nWould you like to check your balance of this account? (yes/no)");
			String check = sc.nextLine();
			if(check.equals("yes")){
				x.checkBalance();
				System.out.println("\nThank you for coming to the ATM!");
			}
			if(check.equals("no")){
				System.out.println("Great! No balance checked.");
				System.out.println("\nThank you for coming to the ATM!");
			}
		}
	}
}
