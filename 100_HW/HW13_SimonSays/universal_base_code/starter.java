/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import pkg.*;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a difficulty level: 1, 2, or 3");
        int diff = sc.nextInt();
        sc.nextLine();

        /* 
            Basics of the game:
            - Given a set of words, the player must memorize the colors
            - After a 5 second delay, the player must type in each color one at a time on separate lines
            - At any point, if they type in an incorrect color, the game ends. The game will print out the correct colors.
            - If they get them all right, the game will continue and add one more word to the series.
            - The series changes every round.
        */

        //  Given the Colors class, use the following method calls to help this program.
        
        
        // Feel free to comment out the test code above when you start your assignment
    
        if(diff == 1){
            int a = 1; 
            while(true){
                System.out.println("--------------------------------------");
                String [] color = new String[a];
                for(int i = 0; i<a; i++){
                    color[i]=getColorWord();
                    System.out.println(color[i]);
                }
                System.out.print("--------------------------------------\nMemorize the phrase above!\nYou have: ");
                delay(5);
                Colors.println();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlease enter the words that you saw on separate lines!");

                if(checkAns(color, a)){
                    System.out.println("You got it! Onto the next level!");
                    a++;
                }
                else{
                    System.out.print("You got it wrong! Try again!\nWORDS ");
                    printArray(color);
                    System.exit(0);
                }
            }
            /*
                Difficulty level 1:
                    The user will receive a series of colors as words (ex. "Red", "Blue", "Green", etc.)
                    The user must type in the colors in the correct order

                1. The game should repeat until the player loses
                2. Each round, a new set of words is generated. The game starts at 1 word and adds one more word each round.
                    - All words should be randomly chosen and stored to be checked later
                    - Print each word when generated for the user to start to memorize
                3. Tell the user to memorize the phrase then start the count down of 5 seconds
                4. After the delay, print a bunch of new lines to clear the screen
                5. Prompt the user to type in each color one at a time
                    - Take in as many inputs as there words generated
                    - Check all words against the generated list of words
                    - ALL words should be taken in, THEN you can tell the user if they lost
                    - This means checking and keeping track of if they lost or not
                6. Once all inputs are taken in 
                    - Tell the user if they lost or won
                    - If they lost, print out the correct series of colors and end the game
                    - If they won, start a new round with one more word (start back at step 1)
            */


        } 
        else if(diff == 2){
            int b = 1;
            while(true){
                System.out.println("--------------------------------------");
                String [] word = new String[b];
                String [] color = new String[b];

                for(int i = 0; i<b; i++){
                    word[i]=getColorWord();
                    color[i]=getColorWord();
                    Colors.println(word[i], color[i]);
                }
                System.out.print("--------------------------------------\nMemorize the phrase above!\nYou have: ");
                delay(5);
                Colors.println();
                int c =(int)(Math.random()*2);
                boolean correct = true;
                if(c==0){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlease enter the WORDS that you saw on separate lines!");
                    correct = checkAns(word, b);
                }
                else{
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlease enter the TEXT COLORS that you saw on separate lines!");
                    correct = checkAns(color, b);
                }

                if(correct){
                    System.out.println("You got it! Onto the next level!");
                    b++;
                }
                else{
                    System.out.print("You got it wrong! Try again!\nWORDS ");
                    printArray(color);
                    System.exit(0);
                }
                
            }
            /*
                Difficulty level 2:
                    This should act the same as difficulty level 1 with the following changes:
                    The user will receive a series of colors as words AND as text color (ex. "Red", "Blue", "Green", etc.)
                    The computer will randomly choose either to check the word as text or as a color
                    The user must type in the colors in the correct order by either text or text color
                    Both the text words and the text colors should be stored to be checked later
            */


        }
        else if(diff == 3){
            int d = 1;
            while(true){
                System.out.println("--------------------------------------");
                String [] word = new String[d];
                String [] color = new String[d];
                String [] bg = new String[d];

                for(int i = 0; i<d; i++){
                    word[i]=getColorWord();
                    color[i]=getColorWord();
                    bg[i]=getColorWord();
                    Colors.println(word[i], color[i], "BG_"+bg[i]);
                }
                System.out.print("--------------------------------------\nMemorize the phrase above!\nYou have: ");
                delay(5);
                Colors.println();
                int c =(int)(Math.random()*3);
                boolean correct = true;
                if(c==0){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlease enter the WORDS that you saw on separate lines!");
                    correct = checkAns(word, d);
                }
                else if(c==1){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlease enter the TEXT COLORS that you saw on separate lines!");
                    correct = checkAns(color, d);
                }
                else{
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPlease enter the BACKROUND COLORS that you saw on separate lines!");
                    correct = checkAns(bg, d);
                }

                if(correct){
                    System.out.println("You got it! Onto the next level!");
                    d++;
                }
                else{
                    System.out.print("You got it wrong! Try again!\nWORDS ");
                    printArray(color);
                    System.exit(0);
                }
            }
            /*
                Difficulty level 3:
                    This should act the same as difficulty level 2 with the following changes:
                    The user will receive a series of colors as words, as text color, and as background color (ex. "Red", "Blue", "Green", etc.)
                    The computer will randomly choose either to check the word as text, as a color, or as background color
                    The user must type in the colors in the correct order
                    All of the text words, the text colors and the background colors should be stored to be checked later
            */
        

        
        }
        else {
            System.out.println("Wrong number, try again.");
        }
    }

    // This method should take in a String array as a parameter and print out each element in the array.
    public static void printArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
	}


    // This method can be called to return a random color. This syntax is the correct syntax for the Colors class. 
    public static String getColorWord(){
        int rand = (int)(Math.random()*5);
        switch (rand){
            case 0: return "Purple";
            case 1: return "Red";
            case 2: return "Green";
            case 3: return "Yellow";
            case 4: return "Blue";
            default: return "White";
        }
    }

    // This method can be called to delay for a certain number of seconds.
    // The parameter count represents the number of seconds to delay.
    public static void delay(int count){
        for (int i = 0; i < count; i++) {
			System.out.print(count-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
    }
    private static boolean checkAns(String [] arr, int n){
        Scanner sc = new Scanner(System.in);
        boolean correct = true;
        for(int i = 0; i<n; i++){
            String ans = sc.nextLine();
            if(!ans.equalsIgnoreCase(arr[i])){
                correct = false;
            }
        }
        return correct;        
    }
}
