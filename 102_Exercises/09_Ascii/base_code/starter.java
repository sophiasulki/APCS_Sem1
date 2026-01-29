/*
 *	Author: Sophia Kim
 *  Date: 9.29.25
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an animal, object, or face: ");
		String thing = sc.nextLine();
		if(thing.equals("animal")){
			System.out.println("Heres a monkey!");
			System.out.println("          __");
			System.out.println("        c(..)o");
			System.out.println("         (-)");
		}
		else if(thing.equals("object")){
			System.out.println("Heres a gun!");
			System.out.println("      __,_____");
			System.out.println("     / __.==--'");
			System.out.println("    /#(-'");
			System.out.println("    `-'");
		}
		else if(thing.equals("face")){
			System.out.println("Heres your face!");
			System.out.println("      ___ ___");
			System.out.println("      (.) (.) ");
			System.out.println("         0 ");
			System.out.println("        --- ");
		}
		else{
			System.out.println("That was not an option.");
		}
	}
}
