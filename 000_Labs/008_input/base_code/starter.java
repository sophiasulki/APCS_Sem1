/*
 *	Author:  Sophia Kim
 *  Date: 9.3.25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?");
    String name = sc.nextLine();
    System.out.println("What is your age?");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.println("What month is your birthday?");
    String month = sc.nextLine();
    System.out.println("What day is your birthday?");
    int day = sc.nextInt();
    System.out.println("What year is your birthday?");
    int year = sc.nextInt();
    System.out.println("How much is a buck fifty?");
    double much = sc.nextDouble();
	}
}
