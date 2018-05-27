/**
 * Write a program that prompts the user to enter a monthly savings amount and displays the account 
 * value after the sixth month.
 *
 * Suppose you save $100 each month, annual interest rate of 5%.  Monthly interest rate is .05/12 = 0.00417.
 *
 *
 */

package chapter2;

import java.util.Scanner;

public class exercise13 {
	
	// main method
	public static void main(String[] args) {
		
		// start scanner
		Scanner input = new Scanner(System.in);
		
		// obtain monthly savings amount
		System.out.print("Enter the monthly saving amount: ");
		double amount = input.nextInt();
		
		// calculate interest rates
		double annualInterest = .05;
		double monthlyInterest = annualInterest / 12;

		// calculate the 6-month value in of the account
		// month 1
		double firstMonth = amount * (1 + monthlyInterest);

		// month2
		double secondMonth = (firstMonth + amount) * (1 + monthlyInterest);

		// month3
		double thirdMonth = (secondMonth + amount) * (1 + monthlyInterest);

		// month4
		double fourthMonth = (thirdMonth + amount) * (1 + monthlyInterest);

		// month5
		double fifthMonth = (fourthMonth + amount) * (1 + monthlyInterest);

		// month6
		double sixthMonth = (fifthMonth + amount) * (1 + monthlyInterest);
		
		// display results
		System.out.println("After the xith month the account value is $" + sixthMonth);

	}

}
