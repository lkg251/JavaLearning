package java_data_types;

import java.util.Scanner;

public class Day08_task {

	public static void main(String[] args) {
		// this is the object of the scanner class
		Scanner monthInput = new Scanner(System.in);
		for (int a = 0; a < 3; a++) {

			System.out.println("Enter the month you were born in : ");
			String monthName = monthInput.next();
			if (monthName.equalsIgnoreCase("January") || monthName.equalsIgnoreCase("February") || monthName.equalsIgnoreCase("March")) {
				System.out.println("You were born in Winter");
			} else if (monthName.equalsIgnoreCase("April") || monthName.equalsIgnoreCase("May") || monthName.equalsIgnoreCase("June")) {
				System.out.println("You were born in Spring");
			} else if (monthName.equalsIgnoreCase("July") || monthName.equalsIgnoreCase("August")
					|| monthName.equalsIgnoreCase("September")) {
				System.out.println("You were born in Summer");
			} else if (monthName.equalsIgnoreCase("October") || monthName.equalsIgnoreCase("November")
					|| monthName.equalsIgnoreCase("December")) {
				System.out.println("You were born in Fall");
			} else {
				System.out.println("Something went wrong");
			}

		}
	}
}