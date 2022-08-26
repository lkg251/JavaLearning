package java_data_types;

public class Day24_TaskAssignment {

// Task 1. Create a method that will take 1 parameter as a String.If the String has odd number of characters and has 3 or more characters,print the character in the middle of the String.
//Task 2. Create a method that will take 1 parameter as a String. If the String has even number of characters and has 5 or more characters, print the middle two characters of the String.
// Task 3. Create a method that will take 2 parameters as a String(actualValue, expectedValue). Your method should return boolean value verifying whethergiven two strings are equal or not

	public static void main(String[] args) {
		taskOne("FrenchBulldog");
		taskTwo("abcdefg");
		System.out.println(taskThree("lesly", "gil"));
		System.out.println(taskThree("lesly", "gil"));
	}

	public static void taskOne(String word3) {
		int worldLength = word3.length(); // 3
		if (worldLength >= 3) {
			if (worldLength % 2 == 1) {
				int center = worldLength / 2;
				System.out.println(word3.substring(center, center + 1));
			}
		}

	}

	public static void taskTwo(String word) {

		int worldLength = word.length(); // 5
		if (worldLength > 5) {
			if (worldLength % 2 == 0) {
				int center = worldLength / 2;
				System.out.println(word.substring(center - 1, center + 1));
			}
		}
	}

	public static boolean taskThree(String valueOne, String valueTwo) {
		return valueOne.equals(valueTwo);
	}
}
