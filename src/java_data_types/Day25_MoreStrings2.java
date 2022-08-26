package java_data_types;

public class Day25_MoreStrings2 {
	
	
	
	// char array method

	public static void main(String[] args) {
		String name = "Hello World";
		char[] characters = name.toCharArray(); // {H,e,l,l,o, w,o,r,l,d}

		System.out.println(characters.length);
		// allows you to print vertically
		for (int i = 0; i < characters.length; i++) {
			System.out.println(characters[i]);
		}
		//string of array 
		String sentence = "Hello today we are learning more string.";
		String[] words = sentence.split(" ");//{hello,today,....
		for (int i=0; i< words.length; i++) {
			System.out.println(words[i]);
			
			
			
			
		}
	}

}
