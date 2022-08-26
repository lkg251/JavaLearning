package java_data_types;

public class Day25_task1 {

	public static void main(String[] args) {
		// 1.Create a method that will take 1 String sentence as a parameter. Inside
		// your method write a code that should return a String without any spaces.
		// 2.Create a method that will take 1 String as parameter (your String should be
		// combination of letters, numbers and special characters). Inside your method
		// write a logic that will calculate the number of alpha characters only and
		// your method should return that number.
		// 3.You have a String a="Today is a good day. It is Thursday. We have a Java
		// Class". How would you find out how many sentences are in that String?

		////////////////////////////////////////////////////////////////////////////////
		
		String sentence = ("Hello today we are going to the zoo.");
		String[] words = sentence.split(" ");// {hello,today,....
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		///////////////////////////////////////////////////////////////////////////////
		
		String word = ("123!@#ASDzxc");
		String onlySpecialCharacters = word.replaceAll("[A-Za-z0-9]", "");
		System.out.println("This will show special characters only : " + onlySpecialCharacters);

		//////////////////////////////////////////////////////////////////////////////

		String s = ("Today is a good day. It is Thursday. We have a Java Class.");
		String[] words1 = s.split("\\.");
		for (int j = 0; j < words1.length; j++) {
			System.out.println(words1[j]);

		}
	}
}
