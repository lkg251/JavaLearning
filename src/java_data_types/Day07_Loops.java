package java_data_types;

import java.util.Scanner;

public class Day07_Loops {

	public static void main(String[] args) {
// allows you to print out x/times , you initiate the value. 

		// for (int i = 0; i <= 10; i++) {
		// System.out.println(i);

		// for (int i = 10; i >= 0; i--) {
		// System.out.println(i);

		// print number 1- 100

		// for (int i = 1; i <=100; i ++){
		// System.out.println(i);

		// print number 100 to 1
		// for (int i =100; i >=1; i --) {
		// System.out.println(i);

		// print even numbers between 20 and 50

		// for (int i = 20; i <= 50; i++) {
		// if (i % 2 == 0) {
		// System.out.println(i);
		//}

		// odd numbers you would have to put ending ! or 1  on line 28 to signify for odd
		// numbers
		
		//	for (int i = 20; i <= 50; i++) {
			//if (i % 2== 1) {
			//	System.out.println(i);

		for(int i =1; i<=3; i++) {
			
		System.out.println("What month were you born in?");
			

		Scanner birthMonth = new Scanner(System.in);
		String month = birthMonth.next();
	
		if(month.equalsIgnoreCase("January")||month.equalsIgnoreCase("February")||month.equalsIgnoreCase("March")) {
			System.out.println("You were born in Winter");
		}else if (month.equalsIgnoreCase("April")||month.equalsIgnoreCase("May")||month.equalsIgnoreCase("June")) {
			System.out.println("You were born in Spring");
		}else if (month.equalsIgnoreCase("July")||month.equalsIgnoreCase("August")||month.equalsIgnoreCase("September")) {
			System.out.println("You were born in Summer");
		}else if (month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")||month.equalsIgnoreCase("December")) {
			System.out.println("You were born in Fall");
		}else {
			System.out.println("Something went wrong");
		}}
	}
}
	
