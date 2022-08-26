package java_data_types;

public class Day24_Task {

	public static void main(String[] args) {

		// Task 1. Create a method that will take 1 parameter as a String.
		// If the String has odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.
//		Task 2. Create a method that will take 1 parameter as a String. If the String has even number of characters and has 5 or more characters, print the middle two characters of the String.
		// Task 3. Create a method that will take 2 parameters as a String(actualValue,
		// expectedValue). Your method should return boolean value verifying whether
		// given two strings are equal or not
	}

	public static void method(String a) {
		if (a.length() >= 3) {
			if (a.length() % 2 == 1) {
				int index = a.length() / 2;
				System.out.println(a.charAt(index));
			} else {
				System.out.println("value entered is either even of characters");

			}
		}
	}

	public static void method1(String a) {
		if (a.length() % 2 == 0) {
			int index = a.length() / 2;
			System.out.println(a.substring(index - 1, index + 1));
		} else {
			System.out.println("value entered is odd, and less than 5 characters");
		}

	}

	boolean method3(String actualValue, String expectedvalue) {
		boolean answer = actualValue.equalsIgnoreCase(expectedvalue);
		return answer;

	}
}
