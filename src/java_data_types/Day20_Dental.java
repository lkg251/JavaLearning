package java_data_types;

abstract class Dental {
	
	abstract void metalBraces();
	abstract void  aligners();

}
abstract class braces extends Dental{
	
	abstract void clarityBraces();
	
	}
	

	class MO extends braces {
		void metalBraces() {
			System.out.println("This is the metalBraces");
		}
		
		void aligners() {
			System.out.println("This is aligners");
		}
		void clarityBraces() {
			System.out.println("This is clarityBraces");
		}
		
	}

public class Day20_Dental {

	public static void main(String[] args) {
	MO d = new MO();
	d. metalBraces();
	d. aligners();
	d. clarityBraces(); 
		

	}

}
