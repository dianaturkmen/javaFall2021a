package Replit;

import java.util.Scanner;

public class List_01_enCokHangiHarf {

	public static void main(String[] args) {
		
		/*Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

		input :

		Learning java is easy

		output:

		maximum occurring character is : a*/
		
		
		
	        String str = "Learning java is easy";
	        String arr[] = str.split("");

	        String enCokTekrarEden = "";
	        int maxsayac = 0;
	        int sayac = 0;
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i].equalsIgnoreCase(arr[j])) {
	                    sayac++;
	                }
	            }
	            if (sayac > maxsayac) {
	                maxsayac = sayac;
	                enCokTekrarEden = arr[i];
	            } else if (sayac == maxsayac) {

	                enCokTekrarEden += ", " + arr[i];
	            }

	            sayac = 0;
	        }
	        System.out.println(enCokTekrarEden);
		
		

	}

}
