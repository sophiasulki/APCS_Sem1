/*
 *	Author: Sophia Kim
 *  Date: 10.19.25
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Would you like to play the computer? (yes/no/done)");
            String option = sc.nextLine();
            if(option.equals("yes")){
                System.out.println("--------------------------------------------------------------\nPlease enter rock/paper/scissors:");
                String play = sc.nextLine();
                while(true){
                    if(!play.equals("scissors")&&!play.equals("rock")&&!play.equals("paper")){
                        System.out.println("Invalid input, please type in rock/paper/scissors:");
                    }
                    else{
                        break;
                        }
                    }
                String compChoice = getObject();
                int result = compare2(play,compChoice);
                if(result == 0){
                    System.out.println("You tied!");
                }
                else if(result == 1){
                    System.out.println("You won!!!");
                }
                else{
                    System.out.println("You lost! :(");
                }
                System.out.println("\n--------------------------------------------------------------");
            }
            else if(option.equals("no")){
                System.out.println("\n--------------------------------------------------------------\nHow many times would you like the computer to play itself?");
                int numTimes = sc.nextInt();
                sc.nextLine();
                int times = 0;
                int play1 = 0;
                int play2 = 0;
                int ties = 0;
                while(times < numTimes){
                    String comp1 = getObject();
                    String comp2 = getObject();
                    int result2 = compare2(comp1, comp2);
                    switch(result2){
                        case 0:
                            ties++;
                            break;
                        case 1:
                            play1++;
                            break;
                        case 2:
                            play2++;
                            break;
                    }
                    times++;
                }
                System.out.println("Player 1 wins: " + play1 + "\nPlayer 2 wins: " + play2 + "\nTies: " + ties);
                System.out.println("\n--------------------------------------------------------------");
            }
            else if(option.equals("done")){
                System.out.println("\n--------------------------------------------------------------\nThanks for playing!");
                break;
            }
        }
    }
    public static String getObject(){
        int choice = (int)(Math.random()*2+1);
        if(choice==1){
            return "rock";
        }
        else if(choice==2){
            return "paper";
        }
        else{
            return "scissors";
        }
    }
    public static int compare2(String player1, String player2){
        if(player1.equals("rock")){
            if(player2.equals("paper")){
                return 2;
            }
            else if(player2.equals("rock")){
                return 0;
            }
            else{
                return 1;
            }
        }
        else if(player1.equals("paper")){
            if(player2.equals("paper")){
                return 0;
            }
            else if(player2.equals("rock")){
                return 1;
            }
            else{
                return 2;
            }
        }
        else{
            if(player2.equals("paper")){
                return 1;
            }
            else if(player2.equals("rock")){
                return 2;
            }
            else{
                return 0;
            }
        }
        
    }
}
