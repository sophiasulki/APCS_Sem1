/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int num = sc.nextInt();
		System.out.print("Please enter another integer: ");
		int num1 = sc.nextInt();
		System.out.println("");
		
		if(num%2==0){
			System.out.println(num+" is even");
		}
		else{
			System.out.println(num+" is odd");
		}
		System.out.println("");
		
		if(num%3==0){
			System.out.println(num+" is divisible by 3");
		}
		else{
			System.out.println(num+" is not divisible by 3");
		}
		if(num%4==0){
			System.out.println(num+" is divisible by 4");
		}
		else{
			System.out.println(num+" is not divisible by 4");
		}
		if(num%5==0){
			System.out.println(num+" is divisible by 5");
		}
		else{
			System.out.println(num+" is not divisible by 5");
		}
		System.out.println("");
		
		if(num1%2==0){
			System.out.println(num1+" is even");
		}
		else{
			System.out.println(num1+" is odd");
		}
		System.out.println("");
		
		if(num1%3==0){
			System.out.println(num1+" is divisible by 3");
		}
		else{
			System.out.println(num1+" is not divisible by 3");
		}
		if(num1%4==0){
			System.out.println(num1+" is divisible by 4");
		}
		else{
			System.out.println(num1+" is not divisible by 4");
		}
		if(num1%5==0){
			System.out.println(num1+" is divisible by 5");
		}
		else{
			System.out.println(num1+" is not divisible by 5");
		}
	}
}
