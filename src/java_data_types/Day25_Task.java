package java_data_types;

public class Day25_Task {

	public static void main(String[] args) {
		// char array allows you to print it vertically 
		String name = "Hello today we are learning more strings.";
		char[] characters = name.toCharArray();
		
		for (int i=0; i< characters.length; i++) {
			System.out.println(characters[i]);

	}
		
		String sentence="I can't wait for it to be friday.";
		String[] words =sentence.split(" ");
		
		for (int i=0; i< characters.length; i++) {
			String word=words[i];
			char[]characs =word.toCharArray();
			for (int x=0; x< characs.length; x++) {
				System.out.println(characs[x]);
			}
		}
	}
}
