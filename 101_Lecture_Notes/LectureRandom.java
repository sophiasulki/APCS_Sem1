/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
        System.out.println(Math.random()*5);
        System.out.println(Math.random()*20+15);
        System.out.println(Math.random()*1051+1472);
        //you can do System.out.println(Math.random()*(2523-1472)+1472); if u dont wanna do the math
        System.out.println((int)(Math.random()*(513-(-342))-342));
       
        int low = (int)(Math.random()*(75-30)+30);
        int high = (int)(Math.random()*(160-80)+80);
        System.out.println((int)(Math.random()*(high-low)+low));
	}
}
