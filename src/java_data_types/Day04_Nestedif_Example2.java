 package java_data_types;

public class Day04_Nestedif_Example2 {

	public static void main(String[] args) {
		// if the person's age is less than 18 he can apply for learner
		// and if the age is greater than 18, he can apply for driver license
		// if the age is greater than 21 he can start working
		// if the age is greater than 65 he is ready to retire

		int age = 65;
		String name = "Steve";

		if (age < 18) {
			System.out.println(name + " can apply for learner's permit");
		} else {
			System.out.println(name +  " is greater than age 18. He can apply for driving license");
			if (age > 18) {
				System.out.println(name + " is less than 21. You are not ready for work");
			} else {
				System.out.println(name + " is greater than 21. You can start working");
			}
			if (age > 65) {
				System.out.println(name + " can continue to work");
			} else {
				System.out.println(name + " ready to retire");
			}
		}
		
		// if the persons age is 21 they can purchase alcohol
		// if the person is less than 21 they can't purchase alcohol
		
		 int age_range = 17;
		String name1 ="Eddie";
		
		 if (age_range < 21) {
			 System.out.println(name1 + " can not purchase alcohol");
		 }else {
			 System.out.println(name1 + " is less than 21. He can not purchase alcohol");
			 if (age <21) {
				 System.out.println(name + "is greater than 21. He can purchase alcohol");
			
			 } 

					String movie_genre = Comedy;
					String movie = "The week of";
					
					if (comedy = The week of){
						System.out.println(movie_genre + " you should watch The week of by Adam Sandler");
					} else if (drama = Hustle )
						System.out.println(movie_genres +  " you should watch Hustle by Adam Sandler");
			
					
		 }
	}
}
