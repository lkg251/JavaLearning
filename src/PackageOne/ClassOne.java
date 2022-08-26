package PackageOne;

import PackageTwo.ClassThree;

//within a class 
public class ClassOne {
	public int a1 = 10;
	private int b1 = 20;
	int c1 = 90;
	
	public static void main(String[] args) {
		ClassOne c1 = new ClassOne();
		c1.methodSeven();
		System.out.println(c1.c1);
		
		ClassThree c3 = new ClassThree();
		// c3.methodEight();// is not accessible because it is present in a diff package
		// System.out.println(c3.c3);// this variable is not accessible because it is present 
		
	}
	static void methodSeven() {
		System.out.println("This is method Seven");
	
	}
		

		// c1.methodOne();
		// System.out.println(c1.a1);
//		c1.methodFour();
//		System.out.println(c1.b1);

//		ClassFour c4 = new ClassFour();
//		System.out.println(c4.a4);

	//	ClassThree c3 = new ClassThree();
//		c3.methodThree();//because the method is private
//		System.out.println(c3.a3); // because the variable is private 

	//	c1.methodFour();
	//	System.out.println(c1.b1);
	//}
//
	public static void methodOne() {
		System.out.println("This is method 1.");

	}

	private static void methodFour() {
		System.out.println("This is method 4");
	}
}
