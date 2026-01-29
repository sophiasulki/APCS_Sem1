package pkg;
import java.util.*;

public class ShoppingCartItem {
    private String itemName;
    private double itemCost;
    private int quantity;
    public ShoppingCartItem(){
        itemName = "Nothing";
        itemCost = 0.0;
        quantity = 0;
    }
    public ShoppingCartItem(String n, double c, int q){
        itemName = n;
        itemCost = c;
        quantity = q;
    }
    public void cartToString(){
        System.out.println("You have "+quantity+" of "+itemName+" for $"+itemCost+" each."); 
    }
    public String getItemName(){
        return itemName;
    }
    public double getTotalCost(){
        return itemCost*quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getTotalWithTax(){
        return (itemCost*quantity*1.12);
    }
    public double quantityToCostCalculator(int q){
        return (q*itemCost);
    }
    public double getItemCost(){
        return itemCost;
    }
    public boolean compareItemCost(ShoppingCartItem h){
        if(this.itemCost<h.getItemCost()){
            return true;
        }
        else{
            return false;
        }
    }
    public ShoppingCartItem copyCart(){
        return this;
    }
}
