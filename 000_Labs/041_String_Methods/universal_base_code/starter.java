/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first name and a last name with a space in between:");
		String name = sc.nextLine();
		int b = name.indexOf(" ");
		System.out.println("The last name is:"+name.substring(b));
		
	}
}
