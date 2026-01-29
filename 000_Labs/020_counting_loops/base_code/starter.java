/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		System.out.print("Please enter an integer: ");
		int x = sc.nextInt();
		int a = 0;
		while(true){
			if(a==x){
				break;
			}
			System.out.println(a+". "+name);
			a=a+1;
			
		}

		
	}
}
