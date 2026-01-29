/*
 *	Author:  Sophia Kim
 *  Date: 10.9.25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int base = sc.nextInt();
		System.out.println("What is your exponent number?");
		int expo = sc.nextInt();
		System.out.println("Your answer is "+pow(base,expo));
	}
	public static long pow(int a, int b){
		int h = 1;
		long sum = a;
		if(b==0){
			return 1;
		}
		else{
			while(true){
			if(h==b){
				break;
			}
			
			sum = sum*a;
			h++;
			}
		return sum;
		}
	}
}
