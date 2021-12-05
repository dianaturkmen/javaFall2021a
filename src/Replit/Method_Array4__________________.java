package Replit;

import java.util.Arrays;

public class Method_Array4__________________ {

	public static void main(String[] args) {
		// Create a custom return type method accepts a name as parameter and prints the
		// name as a char array.

		// (do not use toCharArray() method)

		// Input : John

		// Output :[J, o, h, n]

		String isim = "John";
		
		String dizi[] = new String [isim.length()];

		dizi = diziyeCevir(isim);
		System.out.println(Arrays.toString(dizi));

	}

	private static String[] diziyeCevir(String isim) {
		
		String str[]=new String [isim.length()];
		
		str=isim.split("");
		
		
		return str;
	}

	

}
