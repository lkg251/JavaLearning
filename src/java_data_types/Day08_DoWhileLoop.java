package java_data_types;

public class Day08_DoWhileLoop {

	public static void main(String[] args) {
		int a = 0;
		do {
			System.out.println("Hello");
			if (a == 20) {
				System.out.println("The value of a is 20");
				break;
			}
			a++;
		} while (a < 15);
	}

}
