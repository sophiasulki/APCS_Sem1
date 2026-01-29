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
		String [] arr = new String[10];
		arr [0] = "I was a girl in the village doin' alright";
		arr [1] = "Then I became a princess overnight";
		arr [2] = "Now I gotta figure out how to do it right";
		arr [3] = "So much to learn and see";
		arr [4] = "Up in the castle with my new family";
		arr [5] = "In a school that's just for royalty";
		arr [5] = "A whole enchanted world is waiting for me";
		arr [7] = "I'm so excited to be";
		arr [8] = "(Sofia the First) I'm findin' out what bein' royal's all about";
		arr [9] = "(Sofia the First) Makin' my way, it's an adventure every day";
		int count = 0;
		while(count<10){
			System.out.println(arr[count]);
			count++;
		}

		
	}
}
