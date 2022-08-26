package java_data_types;

public class Day21_MethodOverloadingex {

	public static void main(String[] args) {
		addition(50, 50);
		addition(5,9.51f);
		addition("Hello", "Moon");
		
		
	}
	// method overloading by changing the number of parameters
	static void addition(int a, int b) {
		System.out.println(a + b);
	}
	// method overloading by changing the type of variables
	static void addition(int a, float b) {
		System.out.println(a + b);
	}
	static void addition(String a, String b) {
		System.out.println(a + b);
	}

	}

