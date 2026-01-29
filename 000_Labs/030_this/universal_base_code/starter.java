/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		int dup = 0;
		PooleDwarf test = new PooleDwarf(randName(),((int)(Math.random()*7)));
		PooleDwarf test1 = new PooleDwarf(randName(),((int)(Math.random()*7)));
		PooleDwarf test2 = new PooleDwarf(randName(),((int)(Math.random()*7)));
		PooleDwarf test3 = new PooleDwarf(randName(),((int)(Math.random()*7)));
		PooleDwarf test4 = new PooleDwarf(randName(),((int)(Math.random()*7)));
		PooleDwarf test5 = new PooleDwarf(randName(),((int)(Math.random()*7)));
		PooleDwarf test6 = new PooleDwarf(randName(),((int)(Math.random()*7)));
		if(test.isSameName(test1.getName())){
			dup++;
		}
		if(test.isSameName(test2.getName())){
			dup++;
		}
		if(test.isSameName(test3.getName())){
			dup++;
		}
		if(test.isSameName(test4.getName())){
			dup++;
		}
		if(test.isSameName(test5.getName())){
			dup++;
		}
		if(test.isSameName(test6.getName())){
			dup++;
		}
		System.out.println(test.getName()+"was the name with "+dup+" matches!");
	}
}
