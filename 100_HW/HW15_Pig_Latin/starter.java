/*
   * Author: Sophia Kim
   * Date: 12.14.25
   * Collaborator(s):
*/
import java.util.Scanner;

class starter {
	private static final String VOWELS = "aeiou";
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String str = sc.nextLine() + " ";
		String a = "";
		String b = "";
		String word = "";
		int space = 0;
		while(str.indexOf(" ")!=-1){
			space = str.indexOf(" ");
			word = str.substring(0,space);
			str = str.substring(space+1);
			a = word.substring(0,1);
			if(isVowel(a)){
				System.out.print(word+"-way ");
			}
			else{
				String c = a;
				if (word.length()>1 && isConsonant(word.substring(1, 2))) {
					c += word.substring(1, 2);
				}
				System.out.print(word.substring(c.length()) + "-" + c+"ay ");
			}
		}
	}
	
	private static boolean isVowel(String a) {
		return VOWELS.contains(a);
	}
	
	private static boolean isConsonant(String a) {
		return !isVowel(a);
	}
}
