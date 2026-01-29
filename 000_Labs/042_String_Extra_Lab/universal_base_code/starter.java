/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		System.out.println("Enter a sentence.");
		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		String ans = "";
		String word = "";
		int beg = 0;
		int inx = 0;
		while(beg<sent.length()){
			inx = sent.indexOf(" ", beg);
			if (inx<0) {
				word = sent.substring(beg);
				ans = word + " " + ans;
				break;
			} else {
				word = sent.substring(beg, inx);
				ans = word + (beg==0 ? "" : " ") + ans;
			}
			beg = inx+1;
		}
		System.out.println(ans);
		


		
	}
}
