package java_data_types;

public class Day23_John_King {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String fname = "John";
		String lname = "King";
		int name = fname.compareToIgnoreCase(lname);
		if (name < 0) {
			System.out.println("the value is negative");
		}else if (name > 0) {
			System.out.println("the value is positive");
		}else {
			System.out.println("the value is 0");
		}
		System.out.println(fname.compareToIgnoreCase(lname));
		
		
		
		
	}
	

}
