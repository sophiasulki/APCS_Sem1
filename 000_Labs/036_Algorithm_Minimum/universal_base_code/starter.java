/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int num = (int)(Math.random()*(201-51)+51);
		int [] arr = new int[num];
		int min = Integer.MAX_VALUE;
		int max = 0;
		int ave = 0;
		for(int i = 0; i<num; i++){
			arr[i]=(int)(Math.random()*(101-1)+1);
			if(arr[i]<min){
				min=arr[i];
			}
			else if(arr[i]>max){
				max = arr[i];
			}
			ave += arr[i];
		}
		ave = ave/arr.length;
		System.out.println("There are "+num+" elements.\n"+"Minimum: "+min+"\nMaximum: "+max+"\nAverage: "+ave);
	}
}
