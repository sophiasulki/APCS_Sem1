/*
	Author:
	Date:
*/
import java.util.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Please enter a word or phrase:");
		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		System.out.println("Your word/phrase as sPoNgE cAsE:");
		
		while(sent.indexOf(" ") != -1){
			String word = sent.substring(0, sent.indexOf(" "));
			System.out.print(spongeWord(word)+ " ");
			sent = sent.substring(sent.indexOf(" ")+1);
		}
		System.out.println(spongeWord(sent));
	}
	
	
	public static String spongeWord(String word){
		String ans = "";
		for(int i = 0; i < word.length(); i++){
			String letter = word.substring(i,i+1);
			if(i%2==0){
				letter = letter.toLowerCase();
			}
			else{
				letter = letter.toUpperCase();
			}
			ans = ans+letter;
		}
		return ans;
	}
}