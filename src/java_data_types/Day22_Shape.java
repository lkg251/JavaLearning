package java_data_types;
//abstract class								
abstract class Shape {
	abstract int RectangleArea(int length, int width);    //abstract methods		//parameters go in ()

	abstract int SquareArea(int side);

	abstract double CircleArea(double radius);
}

class area extends Shape {			//subclasses
//methods with return value
	int RectangleArea(int length, int width) {
		int RectangleAreaAnswer = length * width;
		return RectangleAreaAnswer;
	}

	int SquareArea(int side) {
		int SquareAreaAnswer = side * 4;
		return SquareAreaAnswer; 
	}

	double CircleArea(double radius) {
		double CircleAreaAnswer = 2 * 3.14 * radius; 
		return CircleAreaAnswer;
	}

}

public class Day22_Shape {
//main class and main method
	public static void main(String[] args) {
		//object of a class 
		area a = new area();
	System.out.println(a.RectangleArea(2, 10));
	System.out.println(a.SquareArea(2));
	System.out.println(a.CircleArea(3));
	}

}
