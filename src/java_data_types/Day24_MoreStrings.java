package java_data_types;

public class Day24_MoreStrings {

	public static void main(String[] args) {
		//concat method
		String fname = "Lesly";
		String lname = "Gil";
		String  fullname = fname.concat(lname);
		System.out.println(fullname);

		// trim method
		String day = " Today we are learning Strings ";
		
		System.out.println("Before using trim :" +day);
		day = day.trim();
		System.out.println("after using trim:"+day);
		if (day.equals("Today we are learning String")) {
			System.out.println("Yay, the string value matched");
		}else {
			System.out.println("The value does not match");
		}
		
		//starts with and ends with method
		String transaction = "$50.00";
		boolean dollarSymbol = transaction.startsWith("$");
		if(dollarSymbol) {
			System.out.println("The prefix is present");
		}else {
			System.out.println("it is not present");
		}
		System.out.println(day.startsWith("Today"));
		boolean stringPresent = day.endsWith("Strings");
		System.out.println(stringPresent); //true
		
		//charAt method 
		 char ret = transaction.charAt(0);
		 System.out.println(ret);
		 
		 System.out.println(transaction.indexOf('5'));
		 String email = "Hello123@gmail.com";
		 System.out.println(email.indexOf('@'));
		 
		 System.out.println(email.substring(8));
		  System.out.println(email.substring(0,8));
		
		String title = "Welcome to the Car dealer$hip";
		System.out.println(title);
		//replace method
		title = title.replace("$","s");
		System.out.println(title);
		
	}

}

