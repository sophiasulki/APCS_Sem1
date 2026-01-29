/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();
		
		System.out.println("Here are the next 5 numbers!");
		System.out.println(num+ ", " + (num+1)+ ", " +(num+2)+ ", " +(num+3)+ ", " +(num+4));
		
		System.out.println("Here are the next 5 multiples of "+num+"!");
		System.out.println(num+ ", " + (num*2)+ ", " +(num*3)+ ", " +(num*4)+ ", " +(num*5));
		
		double num1 = (double)(num);
		System.out.println("Here is "+num+" divided by 100!");
		System.out.println(num1/100);
		
		System.out.println("Here is "+num+" divided by 10!");
		System.out.println(num1/10);
	}
}
