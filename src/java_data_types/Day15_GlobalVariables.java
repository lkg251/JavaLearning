package java_data_types;

public class Day15_GlobalVariables {
	// Global Variable
	String phone = "Iphone";
	String color = "black";
	static int memory = 32;

	public static void main(String[] args) {
		Day15_GlobalVariables johnPhone = new Day15_GlobalVariables();
		System.out.println(johnPhone.phone);
		System.out.println(johnPhone.color);
		System.out.println(johnPhone.memory); //32

		Day15_GlobalVariables stevePhone = new Day15_GlobalVariables();
		stevePhone.phone = "Iphone13";
		stevePhone.color = "Red";
		stevePhone.phone = "Iphone14";
		stevePhone.memory = 64;
		System.out.println(stevePhone.phone);
		System.out.println(stevePhone.color);
		System.out.println(stevePhone.memory); // 64

		Day15_GlobalVariables mikePhone = new Day15_GlobalVariables();
		System.out.println(mikePhone.phone);//default iphone
		System.out.println(mikePhone.color); // default black
		System.out.println(mikePhone.memory); // default 32

		Day15_GlobalVariables vinPhone = new Day15_GlobalVariables();
		vinPhone.phone = "Iphone 12";
		vinPhone.color = "Grey";
		System.out.println(vinPhone.phone); // iphone
		System.out.println(vinPhone.color); // black

	}
}
