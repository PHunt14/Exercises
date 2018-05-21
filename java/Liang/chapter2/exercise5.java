/**
 * Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
 */

package chapter2;

import java.util.Scanner;

public class exercise5 {
	
	// main method
	public static void main(String[] args) {
		
		// create scanner
		Scanner input = new Scanner(System.in);
		// get subtotal and gratuity rate
		System.out.print("Enter the subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		// compute gratuity and total
		double gratuity = subtotal * (gratuityRate/100.00);
		double total = subtotal + gratuity;
		// display result
		System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
	}

}
