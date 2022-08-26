package java_data_types;

public class Day12_Methods {

	public static void main(String[] args) {
		name();

		name2("John");
		name2("Eli");
		name2("Ken");
		name3("John", 23);
		name3("Michael", 55);
		name3("Jim", 40);

		String a = day();// in return it is going to give me String value
		System.out.println(a);

		String b = month();// August
		System.out.println(b);

	}

	public static String day() {
		String todaysDay = "Tuesday";
		return todaysDay;
	}

	public static String month() {
		return "August";
	}

	//method with parameter

	public static void name() {
		System.out.println("My name is Lesly");
	}

	//method with parameter

	public static void name2(String a) {
		System.out.println("My name is " + a);
	}

	//method with 2 parameters

	public static void name3(String name, int age) {
		System.out.println(name + " is " + age + " years old.");
	}

}
