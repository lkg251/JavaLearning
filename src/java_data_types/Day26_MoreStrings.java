package java_data_types;

public class Day26_MoreStrings {
	public static void main(String[]args) {
		
		// String Buffer 
		
		
		String a ="Hello";
		String b = a + "World";
		System.out.println(b);
		
		StringBuffer aa = new StringBuffer("Hello");
		aa.append(" ");
		aa.append("World");
		aa.append("Today we are learning String Buffer");
		System.out.println(aa);
	}
	

}
