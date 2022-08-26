package java_data_types;

import java.util.Scanner;

public class Day06_scanner {

	public static void main(String[] args) {
		// How to create an object
		// classname objectname = new classname();
		Scanner takeInput = new Scanner(System.in);
		System.out.println("Enter the int value : ");
		int val1 = takeInput.nextInt();
		System.out.println("The entered value is : "+val1);
		
		//nextBoolean (true,false)
		System.out.println("Is it raining outside : ");
	boolean val2 = takeInput.nextBoolean();// true or false
	System.out.println("If it is true it is raining, if its false then its not raining : "+val2);
			
	// nextLine (String)
			System.out.println("Enter your name : ");
	String name = takeInput.next();
	System.out.println("The name you entered is : "+ name);
	
	
    Float number;  
  Scanner scan = new Scanner( System.in );       
  System.out.print("Enter the numeric value : ");  
  number = scan.nextFloat();  
  System.out.println("Float value : " + number +" \nTwice value : " + 2.0*number );  
  scan.close();  
	}
  
  // build calculator 
  int a = 5;
  int b = 10; 

 String input = "+";
 Scanner in = new Scanner (System.in);
System.out.print("Enter your first integer value");
  if (input == "+") {
	  System.out.println(a+b);
  }else if (input == "-") {
	  System.out.println(a-b);
  } else if (input == "/") {
	  System.out.println(a/b);
  }else if (input == "*") {
	  System.out.println(a*b);
  }else {
	  System.out.println("You have entered an invalid opperation");
  
	}
}
}
