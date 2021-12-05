package Replit;

public class For_While_01_Character_sayisi_bulma {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a name and a character, then check how many times the
		 * character is repeated in the name using loops in the name
		 * 
		 * e.g:
		 * 
		 * char ch1= 'a' ;
		 * 
		 * String name =“John came late"
		 * 
		 * Expected Output: Number of a = 2
		 * 
		 */

		String name = "John came late";
		char ch1 = 'a';
		int sayac = 0;

		for (int i = 0; i < name.length() - 1; i++) {
			if (name.charAt(i) == 'a') {
				sayac++;
			}

		}
		System.out.println("Number of a ="+sayac);
	}

}
