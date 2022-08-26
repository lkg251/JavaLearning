package java_data_types;
import java.util.Scanner;

public class Day18_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getInput = new Scanner(System.in);
		System.out.println("enter the first value: ");
		int aa = getInput.nextInt(); 
		
		System.out.println("Enter the second value : ");
		int bb = getInput.nextInt();
		
		System.out.println("Enter the third value : ");
		int cc = getInput.nextInt();
		
		int dd = aa+bb+cc;
		System.out.println("The sum is : "+dd);
	}
      
}
