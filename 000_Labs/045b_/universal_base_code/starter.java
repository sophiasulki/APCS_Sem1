/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word that you'd like to hide in a crossword:");
		String word = sc.nextLine();
		int size = word.length()+5;
		String [][] arr = new String[size][size];
		int dir = (int)(Math.random()*3+1);
		if(dir == 1){ //horizontal
			int startCol = (int)(Math.random()*(arr.length-word.length()));
			int row = (int)(Math.random()*arr.length);
			for(int c = 0; c<word.length(); c++){
				arr[row][startCol+c]=word.substring(c,c+1);
			}
		}
		else if(dir == 2){ //vertical
			int startRow = (int)(Math.random()*(arr.length-word.length()));
			int col = (int)(Math.random()*arr[0].length);
			for(int r = 0; r<word.length(); r++){
				arr[startRow+r][col]=word.substring(r,r+1);
			}
		}
		else{ //diagonal
			int startRow = (int)(Math.random()*(arr.length-word.length()));
			int startCol = (int)(Math.random()*(arr.length-word.length()));
			for(int i = 0; i<word.length(); i++){
				arr[startRow+i][startCol+i]=word.substring(i,i+1);
			}
		}
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
        for(int r = 0; r<arr.length; r++){
			for(int c = 0; c<arr[0].length; c++){
				int a = (int)(Math.random()*letters.length);
				if(arr[r][c]==null){
					arr[r][c] = letters[a];
				}
					
			}
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n-----Crossword Puzzle-----");
		for(int r = 0; r<arr.length; r++){
			for(int c = 0; c<arr[0].length; c++){
					System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}

		
	}
}
