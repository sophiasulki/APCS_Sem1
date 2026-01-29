/*
 *	Author: Sophia Kim
 *  Date: 11.12.25
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		System.out.println("----------------------------------------------------");
		System.out.println("These are the 20 numbers: ");
		int [] r = new int[20];
		for(int i = 0; i<r.length; i++){
			r[i] = (int)(Math.random()*(11-1)+1);
			System.out.print(r[i]+" ");
		}
		System.out.println("");
		System.out.println("----------------------------------------------------");
		int a = (int)(Math.random()*(11-1)+1);
		System.out.println("The random number to look for is "+a);
		int dupes = 0;
		for(int i = 0; i<r.length; i++){
			if(r[i]==a){
				System.out.println("The duplicate is found at index "+i);
				dupes++;
			}
		}
		System.out.println("Total number of duplicates for "+a+" is "+dupes);
		System.out.println("----------------------------------------------------");
		System.out.println("Looking for two in a row: ");
		for(int i = 0; i<r.length-1; i++){
			if(r[i]==r[i+1]){
				System.out.println("Two in a row found at indexes "+i+" and "+(i+1)+". The number is "+r[i]);
			}
		}
	}
}
