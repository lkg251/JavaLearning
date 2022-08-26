package java_data_types;

public class Day16_Student_Inheritance extends Day16_FacultyParent {
	int bonus = 2000;

	public static void main(String[] args) {
		Day16_Student_Inheritance a = new Day16_Student_Inheritance();
		System.out.println(a.salary);
		System.out.println(a.bonus);
		a.hello();

	}

}