package java_data_types;

public class DAY08_WhileLoop {

	public static void main(String[] args) {
		int a = 1;
		System.out.println("The value of a before it enters the loop " + a);
		while (a < 10) {
			System.out.println("Hello World");
			a++;
		}
		System.out.println("The value of a after the loop is " + a);
		//System.out.println("The value of i before for loop is" +i);
		for (int i = 0; i < 10; i++) {
			System.out.println("The value inside loop" +i);
		}
		//System.out.println("The value is i outside for loop is " +i);
		

	}
}