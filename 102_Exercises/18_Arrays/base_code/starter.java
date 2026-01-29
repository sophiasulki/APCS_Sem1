/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int[] arr = new int[1000];
		int i = 0;
		while(i<arr.length){
			arr[i++] = i*3;
		}
		i = 0;
		while(i<arr.length){
			System.out.print(arr[i++]);
			System.out.print(", ");
		}
		System.out.println("-----------------------------");
		int a = 0;
		int b = 1000;
		while(a<1000){
			System.out.print(b+", ");
			b--;
			a++;
		}
	}
}
