package Replit;

public class ForWhile_10_NaturalNumber {

	public static void main(String[] args) {
		//Write a Program to find the sum of natural numbers from 1 to 100.

		//OUTPUT : Sum of Natural Numbers 5050
		
		
		int sayac=0;
		int toplam=0;
		
		for (int i = 1; i <= 100; i++) {
			toplam=toplam+i;	
		}	
		System.out.println("Sum of Natural Numbers "+toplam);
		
		}

}
