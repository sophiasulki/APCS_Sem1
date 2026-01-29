package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String owner;
	int accountNumber;
	double balance;
	boolean isActive;
	static int nextAccountNumber = (int)(Math.random()*951+50);

	// -------CONSTRUCTORS-------
	public BankAccount(){
		owner = "unknown";
		balance = 0;
		isActive = true;
		accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}
	public BankAccount(String o){
		owner = o;
		isActive = true;
		balance = 0;
		accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}
	public BankAccount(String o, double b){
		owner = o;
		isActive = true;
		balance = b;
		accountNumber = nextAccountNumber;
		nextAccountNumber++;
	}
	

	// -------METHODS-------
	public void printNext(){
		System.out.println(accountNumber);
	}
	public void displayAccountInfo(){
		System.out.println("Owner: "+owner+"\nAccount Number: "+accountNumber+"\nBalance: $"+balance+"\nIs Active: "+isActive+"\n-------------------------------------------");
	}
	public void checkBalance(){
		System.out.println("Current Account Balance: $"+balance);
	}
	public void setOwner(String o){
		owner = o;
	}
	public String getOwner(){
		return owner;
	}
	public double getBalance(){
		return balance;
	}
	public void closeAccount(){
		System.out.println("Account closed for "+ owner);
		isActive = false;
	}
	public void deposit(double a){
		if(isActive = true){
			balance += a;
		}
	}
	public void withdraw(double a){
		if(isActive = true && a<=balance){
			balance -= a;
		}
	}
}