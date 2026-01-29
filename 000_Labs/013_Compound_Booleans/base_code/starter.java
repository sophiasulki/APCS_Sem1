/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your first number: ");
		int a = sc.nextInt();
		System.out.print("Please enter your second number: ");
		int b = sc.nextInt();
		System.out.print("Please enter your third number: ");
		int c = sc.nextInt();
		
		if(a>b){
			if(a>c){
				System.out.println("Your first number was the largest of the three!");
				System.out.println("Your number was "+a);
			}
		}
		
		if(b>a){
			if(b>c){
				System.out.println("Your second number was the largest of the three!");
				System.out.println("Your number was "+b);
			}
		}
	
		if(c>a){
			if(c>b){
				System.out.println("Your third number was the largest of the three!");
				System.out.println("Your number was "+c);
			}
		}
		
		
		
		if(a<b){
			if(a<c){
				System.out.println("Your first number was the smallest of the three!");
				System.out.println("Your number was "+a);
			}
		}
		
		if(b<a){
			if(b<c){
				System.out.println("Your second number was the smallest of the three!");
				System.out.println("Your number was "+b);
			}
		}
	
		if(c<a){
			if(c<b){
				System.out.println("Your third number was the smallest of the three!");
				System.out.println("Your number was "+c);
			}
		}
	}
}
