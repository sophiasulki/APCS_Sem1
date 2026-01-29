/*
 *	Author: Sophia Kim
 *  Date: 9.5.25
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("Please enter an integer: ");
			int x = sc.nextInt();
			System.out.print("Please enter another integer (larger than the first): ");
			int z = sc.nextInt();
			System.out.println();
			int a = Math.max(x,z);
			int b = Math.min(x,z);
		
			System.out.println("Your range is from "+b+" to "+a+".");
			System.out.println("Here are 5 numbers generated in that range.");
			System.out.println(((int)(Math.random()*(a-b)+x))+", "+((int)(Math.random()*(a-b)+x))+", "+((int)(Math.random()*(a-b)+x))+", "+((int)(Math.random()*(a-b)+x))+", "+((int)(Math.random()*(a-b)+x)));
		
			System.out.println("Would you like to keep going? (y/n)");
			sc.nextLine();
			String yesno = sc.nextLine();
			if(yesno.equals("n")){
				break;
			}
	}
}
	
}
