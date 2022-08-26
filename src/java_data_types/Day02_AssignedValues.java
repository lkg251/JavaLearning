package java_data_types;

public class Day02_AssignedValues {
	//default value
	static int b;
	static char c;	
	static double e;
	static float g;
	static boolean i;
	static String k;
	
	
	public static void main(String[] args) {
		// Initializing a variable
		//the variable name is a and the value is 5
		int a = 5;
		//declared a variable b
	
		System.out.println(a);
		System.out.println(b);
		//initialize a char variable d
		char d= 'h';
		System.out.println(c);
		System.out.println(d);	
		double f = 10.7836787867486788;
		System.out.println(e);
		System.out.println(f);
		float h = 10.2787676767677777f;
		System.out.println(g);
		System.out.println(h);
		boolean j = true;
		System.out.println(i);
		 System.out.println(j);
		String l = "Hello";
		System.out.println(k);
		System.out.println(l);
		
		String first_name= "Lesly";
		String last_name = "Gil";
		System.out.println(first_name + last_name);
		
		System.out.println(first_name + ' ' + last_name);
		System.out.println("Lesly" + ' ' + "Gil");
		System.out.println("********************");
		System.out.println("Arithemtatic Example");
		System.out.println("****************");
		
		int value1 = 50;
		int value2 = 10;
		// Addition
		System.out.println(value1 + value2);
		int sum = value1 + value2;
		System.out.println(sum);
		// Subtraction
		System.out.println(value1 - value2);
		int sub = value1 - value2; // -5
		System.out.println(sub);
		
		//division
		System.out.println(value1 / value2);
		int div = value1/value2;
		System.out.println(div);
		
		double n = 5;
		System.out.println(Math.sqrt(n));
		
		// multiplication
		System.out.println(value1 * value2);
		int mul = value1 * value2;
		System.out.println(mul);
		
		// mod
		System.out.println(value1 % value2);
		int mod = value1%value2;
		System.out.println(mod);
		
		int mix = 4; 
		System.out.println(mix);
		double umbrella = 5;
		System.out.println(umbrella);
		char mila = 'H';
		System.out.println(mila);
		 //Write a program to add an integer varibale value 5 and a double varibale having value 6.2 
		int p = 5;
		double q =6.2;
		System.out.println(p+q);
	
		float r = 3.9f;
		System.out.println(r*r);
		
		byte length = 2;
		byte width = 3;
		int area = length * width;
		System.out.println(area);
		System.out.println(area);
		System.out.println("********************");
		System.out.println("Operators");
		System.out.println("****************");
		
		int aa = 500;
		int bb = 600;
		
		System.out.println(aa ==bb);//true is boolean
		boolean cc = aa==bb;
		System.out.println(cc);
		
		
		System.out.println(aa!=bb);
		boolean dd = aa!=bb;
		System.out.println(dd);
		
		System.out.println(aa > bb);
		boolean ee =aa>bb;
		System.out.println(ee);
		
		System.out.println(200 >= 200);
		boolean ff = 200>=200;
		System.out.println(ff);
		
		System.out.println(100 < 200);
		boolean gg = 100 < 200;
		System.out.println(gg);
		
		System.out.println(2000 <=300);
		boolean hh = 2000 <=300;
		System.out.println(hh);
		
	}

}
