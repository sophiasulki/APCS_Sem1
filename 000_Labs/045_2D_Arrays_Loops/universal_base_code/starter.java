/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		System.out.println("How many rows would you like for your 2D array?");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println("How many columns would you like for your 2D array?");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("---------------------------------------");
		double all = 0;
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[0].length; j++){
				arr[i][j] = (int)(Math.random()*10+1);
				System.out.print(arr[i][j]+" ");
				all+=arr[i][j];
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		System.out.println("What row would you like the average of?");
		int rowAve = sc.nextInt();
		double ave = 0;
		for(int i = 0; i<arr[0].length; i++){
			ave += arr[rowAve][i];
		}
		System.out.println("The row average is " + ave/c);
		System.out.println("The average of the 2D array is "+all/(r*c));

		
	}
}
