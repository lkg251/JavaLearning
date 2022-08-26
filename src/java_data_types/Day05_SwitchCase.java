package java_data_types;

public class Day05_SwitchCase {

	public static void main(String[] args) {

		String day = "march";
		switch ("day") {
		case "monday":
			System.out.println("1st day of the week");
			break;
		case "tuesday":
			System.out.println("2nd day of the week");
			break;
		case "wednesday":
			System.out.println("3rd day of the week");
			break;
		case "thursday":
			System.out.println("4th day of the week");
			break;
		case "friday":
			System.out.println("5th day of the week");
			break;
		case "saturday":
			System.out.println("6th day of the week");
		case "sunday":
			System.out.println("7th day of the week");
			break;
		default:
			System.out.println("You have entered an invalid day");
		}

		// ends here
		int age = 4;
		switch (age) {

		case 1:
			System.out.println("the value is 1");
			break;
		case 2:
			System.out.println("the value is 2");
			break;
		case 3:
			System.out.println("the value is 3");
			break;
		case 4:
			System.out.println("the value is 4");
			break;
		case 5:
			System.out.println("the value is 5");
			break;
		default:
			System.out.println("The value is something else");
		}

		// example for char
		char dental_appliances = 'B';
		switch (dental_appliances) {

		case 'B':
			System.out.println("the value is Braces");
			break;
		case 'R':
			System.out.println("the value is RPE");
			break;
		case 'H':
			System.out.println("the value is Hawley retainers");
			break;
		case 'E':
			System.out.println("the value is Essix retainers");
			break;
		case 'I':
			System.out.println("the value is Invisalign trays");
			break;
		default:
			System.out.println("You need to come for a consult");
		}
	}
}
