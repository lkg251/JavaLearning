package java_data_types;
class Phone1 {
	String make = "Apple";
	String color = "Black";
	void Hello() {
		System.out.println("This method is in parent class");
	}
}

class smartPhone extends Phone1 {
	String make = "Samsung";
	String color = "yellow";
	void Hello(); {
	System.out.println("This methos is in the child class");
	
	}
	
	void displayChildMake() {
		super.Hello();
		System.out.println("The phone is " + make);
		System.out.println("This color is " +color);
		
	}
	void displayParentMembers() {
		System.out.println("this will print parent members : " + super.make);
		System.out.println("this will print color "+ super.color);
		
	}
}







public class Day19_Super {
	public static void main(String[] args) {
		smartPhone a = new smartPhone();
		a. displayChildMake();
		a.displayParentMembers();
	}

}
