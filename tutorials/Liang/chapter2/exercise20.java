/** 
 * Write a program that reads the balance and the annual percentage interest rate and
 * displays the interest for the next month.
 */

package chapter2;

import java.util.Scanner;

public class exercise20 {
	
	// main method
	public static void main(String[] args) {

		// start scanner
		Scanner input = new Scanner(System.in);

		// obtain the points
		System.out.print("Enter balance and interest rate (e.g. 3 for 3%):");
		double balance = input.nextDouble();
		double annualInterestRate = input.nextDouble();

		// calculate interest
		double interest = balance * (annualInterestRate / 1200);
		
		// display results
		System.out.println("The interest is " + interest);
		

	}

}
