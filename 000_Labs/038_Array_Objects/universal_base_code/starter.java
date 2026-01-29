/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		int numWar = 100;
		int numWiz = 100;
		Warrior[] a = new Warrior[100];
		Wizard[] b = new Wizard[100];
		for(int i = 0; i < a.length; i++){
			a[i] = new Warrior();
			b[i] = new Wizard();
		}
		int j = 0;
		int i = 0;
		while((numWiz>0)&&(numWar>0)){
			
			b[j].attack(a[i]);
			if(a[i].isDead()){
				i++;
				numWar--;
			}
			if(j==100){
					break;
				}
			a[i].attack(b[j]);
			if(b[j].isDead()){
				j++;
				numWiz--;
			}
		}
		if(numWar>numWiz){
			System.out.println("Warriors won with "+numWar+" left in the army");
		}
		else if(numWiz>numWar){
			System.out.println("Warriors won with "+numWiz+" left in the army");
		}
		
		

	}
}
