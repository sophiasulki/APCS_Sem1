/*
 *	Author: Sophia Kim
 *  Date: 9.30.25
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		slotMachine();
	}
	
	public static void slotMachine() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules: \n1. Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a) If two numbers match, you double your money.\n   b) If three numbers match, you triple your money.\n   c) If none match, you lose your money.");
		System.out.println("-------------------------------------------------------");
		String x = "hello";
		int w = 100;
		int bet = 0;
		while(true){
			if(w==0){
					System.out.println("You've run out of money! Thanks for coming! Come back soon!");
					break;
				}
			int r1 = (int)(Math.random()*10+1);
			int r2 = (int)(Math.random()*10+1);
			int r3 = (int)(Math.random()*10+1);
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y): ");
			x = sc.nextLine();
			if(x.toUpperCase().startsWith("N")){
				System.out.println("Sad to see you go! You still have $"+w+" left. Come again soon! Thanks!");
				break;
			}
			if(x.toUpperCase().startsWith("Y")){
				System.out.print("You have $"+w+". How much would you like to wager? ");
				do {
					bet = sc.nextInt();
					sc.nextLine();
					if(bet>w){
						System.out.print("You only have "+w+"! Please enter a smaller number: ");
					}
					if(bet<=0){
						System.out.print("Sneaky! No negatives or 0!\nPlease enter a different number: ");
					}
				} while (bet>w || bet <= 0);
				System.out.println("");
				System.out.println("Great! Lets play!!!\nYour rolls are:");
				System.out.println("_________________");
				System.out.println("|"+r1+"|"+r2+"|"+r3+"|");
				System.out.println("_________________");
				if(r1==r2||r2==r3||r1==r3){
					w = (w-bet)+(bet*2);
					System.out.println("You won! Your wager has now been doubled.");
					System.out.println("You now have $"+w+".");
				}
				else if(r1!=r2||r2!=r3||r1!=r3){
					w = w-bet;
					System.out.println("Didn't win this time. Better luck next time!");
					System.out.println("You now have $"+w+".");
				}
				else if(r1==r2&&r1==r3){
					w = (w-bet)+(bet*3);
					System.out.println("You won! Your wager has now been tripled.");
					System.out.println("You now have $"+w+".");
				}
				System.out.println("-------------------------------------------------------");
			}
			
		}
	}
}
