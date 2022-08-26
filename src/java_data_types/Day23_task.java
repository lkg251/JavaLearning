package java_data_types;

public class Day23_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//if the value is 0 we print the value is - if the value is negative print the value is negative
		// if the value is positive print the value is positive		
		//task
		//fname, lNam
		String fname= "Lesly";
		String lName="Gil";
		int n = fname.compareToIgnoreCase(lName);
		if (n<0) {
			System.out.println("the value is negative");
		} else if (n>0){
			System.out.println("the value is positive");
			
		} else if (n==0) {
			System.out.println("the value is 0");
		}else {
			System.out.println("invalid");
		}
		System.out.println(fname.compareToIgnoreCase(lName));
		
		
	}
}


