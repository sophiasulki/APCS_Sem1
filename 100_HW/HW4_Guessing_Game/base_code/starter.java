/*
 *	Author: Sophia Kim
 *  Date: 9.16.25
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("The goal of the game is to guess the word with two hints!");
		System.out.println();
		int a = (int)(Math.random()*(3)+1);
		if(a==1){
			System.out.println("Its a color!");
			String b = sc.nextLine();
			System.out.println();
			if(b.equals("Yellow")||b.equals("yellow")){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("You didn't get it. Here's another hint:");
				System.out.println("When mixed with blue, it makes green!");
				String e = sc.nextLine();
				System.out.println();
				if(e.equals("Yellow")||e.equals("yellow")){
					System.out.println("You got it! Woo!");
				}
				else{
					System.out.println("The answer was yellow, better luck next time!");
				}
			}
		}
		if(a==2){
			System.out.println("Its a pizza topping!");
			String c = sc.nextLine();
			System.out.println();
			if(c.equals("pepperoni")||c.equals("Pepperoni")){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("You didn't get it. Here's another hint:");
				System.out.println("It's red, round, and very common!");
				String f = sc.nextLine();
				System.out.println();
				if(f.equals("pepperoni")||f.equals("Pepperoni")){
					System.out.println("You got it! Woo!");
				}
				else{
					System.out.println("The answer was pepperoni, better luck next time!");
				}
			}
		}
		if(a==3){
			System.out.println("Its a school subject!");
			String d = sc.nextLine();
			System.out.println();
			if(d.equals("math")||d.equals("Math")){
				System.out.println("You got it! Woo!");
			}
			else{
				System.out.println("You didn't get it. Here's another hint:");
				System.out.println("It involves numbers!");
				String g = sc.nextLine();
				System.out.println();
				if(g.equals("math")||g.equals("Math")){
					System.out.println("You got it! Woo!");
				}
				else{
					System.out.println("The answer was math, better luck next time!");
				}
			}
		}
	}
}
