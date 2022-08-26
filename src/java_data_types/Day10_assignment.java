package java_data_types;

import java.util.Scanner;

public class Day10_assignment {

	public static void main(String[] args) {
		// write a program which asks user that how many values they want to do a sum for ?
		// lets say user enters 5
		// it should ask user to enter those 5 values
		// once the user enters those 5 values it should print the sum of those 5 values 
		// Scanner, One dimensional Array, for loop 
		
		
		//asking a user a question, how many values will they want to sum up
		System.out.println("How many values will you like to do a sum for?");
		//creating an object for the method 
		Scanner userInput_variable= new Scanner(System.in); 
		// creating a variable which is capturing the value the user enters 
		int numberCount = userInput_variable.nextInt();
		// creating an array, specifying the size of the array by the number count that was previously counted for 
		int[] arrayofnumbers = new int[numberCount];
		// this is a for loop for the question the user previously entered for the number of value and repeating the question x amount of times 
		for(int i=0; i<numberCount;i++) {
		System.out.println("What is your " + (i + 1) + " number?");
		//captures the information the user entered 
		int value = userInput_variable.nextInt();
		// assigning the value to the slot ,collection of numbers 
		arrayofnumbers[i] = value;
		}
		
		
		
		int sum = 0;
		for(int i=0; i<numberCount; i++) {
			
			sum = sum + arrayofnumbers[i];
		}
		System.out.println(sum);
		userInput_variable.close();
	}
	

}
