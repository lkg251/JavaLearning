package java_data_types;

import java.util.Scanner;

public class Day07_ex {

	public static void main(String[] args) {
		// Need to let the User know what we are doing by interacting with them
		System.out.println("Hello, my name is Lesly. What can I get you to eat?");
		
		// Creating an Object of the Class "Scanner". Using a variable called "Hellfire".
		Scanner Hellfire =  new Scanner(System.in);
		
		// Reading this from right to left we are using the ".next()" method to capture the users input in the String variable restaurant
		String restaurant = Hellfire.next();
		
		System.out.println("Just to confirm you wanted " + restaurant + " right?");
		
		
		Boolean answer = Hellfire.nextBoolean();
		
	
	}

}
