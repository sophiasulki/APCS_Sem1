/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog a = new Dog("Tara", 16);
		Dog b = new Dog("Angela", "human");
		boolean dogabark = false;
		if(a.isSleeping()){
			System.out.println(a.getName()+" is sleeping.");
		}
		else{
			a.bark();
			dogabark = true;
		}
		if(dogabark){
			b.bark();
		}



	}
}
