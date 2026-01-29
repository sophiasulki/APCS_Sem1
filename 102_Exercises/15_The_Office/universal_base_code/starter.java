/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.raiseSalary(2);
		michael.employeeToString();
		System.out.println("Monthly Salary: " + michael.getSalary() + "\nAnnual Salary: " + michael.getAnnualSalary());
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.raiseSalary(3);
		dwight.employeeToString();
		System.out.println("Monthly Salary: " + dwight.getSalary() + "\nAnnual Salary: " + dwight.getAnnualSalary());
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.raiseSalary(2);
		jim.employeeToString();
		System.out.println("Monthly Salary: " + jim.getSalary() + "\nAnnual Salary: " + jim.getAnnualSalary());
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.raiseSalary(30);
		pam.employeeToString();
		System.out.println("Monthly Salary: " + pam.getSalary() + "\nAnnual Salary: " + pam.getAnnualSalary());
		Employee tarly = new Employee(1746, "Tara", "Li", 24);
		tarly.raiseSalary(7);
		tarly.employeeToString();
		System.out.println("Monthly Salary: " + tarly.getSalary() + "\nAnnual Salary: " + tarly.getAnnualSalary());
	}
}
