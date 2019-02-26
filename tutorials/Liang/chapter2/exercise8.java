/**
 */

package chapter2;

import java.util.Scanner;

public class exercise8 {
	
	// main method
	public static void main(String[] args) {
		// start scanner
		Scanner input = new Scanner(System.in);
		
		// obtain the timezone offest
		System.out.println("Enter the time zone offest to GMT: ");
		int offset = input.nextInt();

		// obtain total milliseconds since midnight, Jan 1 1970
		long totalMilliseconds = System.currentTimeMillis();

		// obtain total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;

		// Computer the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;

		// Obtain total minutes
		long totalMinutes = totalSeconds / 60;

		// Compute the original minute in the hour
		long currentMinute = totalMinutes % 60;

		// Obtain the total hours
		long totalHours = totalMinutes / 60;

		// computer the current hour
		long currentHour = totalHours % 24;

		// apply time zone offset
		currentHour = currentHour - offset;

		// display results
		System.out.println("Current time is " + currentHour +  ":" + currentMinute + ":" 
			+ currentSecond + "GMT");

	}

}
