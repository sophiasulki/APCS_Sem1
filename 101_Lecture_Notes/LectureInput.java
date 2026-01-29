/*
    Lecture note example - Input!!
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
       double item1price = 30.45;
       double item2price = 178.79;
       double item3price = 587.64;
        System.out.println("🥖 Welcome to the Bakery! 🥖\nHere's our menu:\n1. 🥨 Pretzel - $" + item1price + "\n2. 🥐 Croissant - $" + item2price + "\n3. 🌮 Taco! - $" + item3price);
        
        System.out.println();
        System.out.println("What's the name for the order?");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("How many Pretzels would you like?");
        int quant1 = sc.nextInt();
        System.out.println("How many Croissants would you like?");
        int quant2 = sc.nextInt();
        System.out.println("How many Taco!s would you like?");
        int quant3 = sc.nextInt();
        
        System.out.println();
        double fish = item1price*quant1+item2price*quant2+item3price*quant3;
        System.out.println("Your total currently is $"+fish);
        System.out.println("What percent would you like to tip?");
        double tipp = sc.nextDouble();
        
        double tip = fish*(tipp/100);
        double grand = tip+fish;
        System.out.println();
        
        System.out.println("🧾"+name+"'s Receipt");
        System.out.println(quant1+" x Pretzel = "+(item1price*quant1));
        System.out.println(quant2+" x Croissant = "+(item2price*quant2));
        System.out.println(quant3+" x Taco! = "+(item3price*quant3));
        System.out.println("Tip ("+tipp+"%) = "+tip);
        System.out.println("-------------------");
        System.out.println("Total = $"+fish);
	}
}
