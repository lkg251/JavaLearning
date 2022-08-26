package java_data_types;

public class Day09_Arrays {

	public static void main(String[] args) {
		int a; // declare the variable
		a = 50;// initialize the variable

		// int[] rollNumber; // declare an array variable
		// rollNumber = new int[5];

		int[] _rollNumber = new int[5];
		_rollNumber[0] = 500;
		_rollNumber[1] = 300;
		_rollNumber[2] = 100;
		_rollNumber[3] = 400;
		_rollNumber[4] = 200;
		// or this both do the same task just written differently
		int[] rollNum = { 100, 200, 300, 400, 500, 100, 200, 300, 400, 500 };
		System.out.println(rollNum[3]);

		int len = rollNum.length; // 30
		for (int i = 0; i < len; i++) {
			System.out.println(rollNum[i]);
		}

		// create an array of string and store students name in different indices
		// first part of i means where we start at second part tells you where do we
		// stop at, last part tells you how much its being incrementing

		String[] strAr1 = new String[] { "Steve", "Bob", "John" };
		String[] strAr2 = { "Emily", "Bob", " John" };
		String[] strAr3 = new String[3]; // Initialization after declaration with specific size
		strAr3[0] = "Emily";
		strAr3[1] = "Bob";
		strAr3[2] = "John";
		System.out.println(strAr3[1]);

		String[] names = { "Sam", "Bobby", "John", "Tom", "Steve" };
		System.out.println(names[0]);
		System.out.println(names.length);

		for (int i = 2; i < names.length; i ++) {
			System.out.println(names[i]);
		}

	}
}