package Replit;

import java.util.Arrays;

public class List_03_CumleTersten {
	public static void main(String[] args) {

	
		/*Get a sentence from the user. Accept the sentence received from the user as a parameter, 
		 * Invert sentence using Array and write a Method that returns the result as a String to the main method.

		Note: Upper and lower case letters, spaces and special characters will not be changed.

		Input :

		It is very nice to write code.

		Output :

		.edoc etirw ot ecin yrev si tI	*/
		
		String cumle="It is very nice to write code.";
		String tersCumle="";

		tersCumle=tersCumleYazdir(cumle);
		System.out.println(tersCumle);
		
	}

	private static String tersCumleYazdir(String cumle) {
String arr[]=cumle.split("");
String tersCumle="";

for (int i = arr.length; i >0; i--) {
	tersCumle=tersCumle.concat(arr[i-1]);
}
		
		
		
		return tersCumle;
	}
}
