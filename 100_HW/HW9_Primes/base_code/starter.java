/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int a = 1;
		System.out.print("Input a number and we'll print out every prime until that number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printPrimes(num);
	}
	public static boolean checkPrime(int a){
		int b = a-1;
		while(b>1){
			if(a%b==0){
				return false;
			}
			b--;
		}
		return true;
	}
	public static void printPrimes(int a){
		int b = 2;
		while(b<a){
			if(checkPrime(b)){
				System.out.println(b);
			}
			b++;
		}
	}
}
