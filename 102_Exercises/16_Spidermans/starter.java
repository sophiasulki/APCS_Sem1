/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman a = new Spiderman("Toby Mcguire", 48, "Green Goblin");
		Spiderman b = new Spiderman("Andrew Garfield", 40, "Electro");
		Spiderman c = new Spiderman("Tom Holland", 27, "The Vulture");
		Spiderman d = new Spiderman();
		d.setActor("Lebron James");
		d.getActor();
		d.setAge(40);
		d.getAge();
		d.setVillain("Michael Jordan");
		d.getVillain();
		a.fight();
		a.printArt();
	}
}
