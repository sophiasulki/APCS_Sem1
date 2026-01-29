/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount z = new BankAccount();
		z.printInfo();
		BankAccount y = new BankAccount("Tara Li");
		y.printInfo();
		BankAccount x = new BankAccount("Angela Kim", 1);
		x.printInfo();
		BankAccount w = new BankAccount("Sophia Pishehvar", 2);
		w.printInfo();

		
	}
}
