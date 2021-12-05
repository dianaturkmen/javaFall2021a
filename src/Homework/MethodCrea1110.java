package Homework;

import java.util.Scanner;

public class MethodCrea1110 {

	public static void main(String[] args) {

		/*
		 * Kullanicidan bir sayi alin.
		 * 
		 * Bu sayinin tek mi cift mi oldugunu,
		 * 
		 * sifirdan buyuk mu kucuk mu oldugunu,
		 * 
		 * ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin
		 * toplamini, 100’den kucukse sadece 1’ler basamagini yazdiran 3 method
		 * olusturun.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz :");
		int sayi = scan.nextInt();
		sayiTekmiCiftmi(sayi);
		sifirdanBuyukMu(sayi);
		yuzdenBuyukmu(sayi);

	}

	private static void yuzdenBuyukmu(int sayi) {

		sayi = sayi % 1000; // sayinin son uc basamagini alir
		// System.out.println(sayi);
		int yuzler = sayi / 100;
		int onlar = sayi % 100 / 10;
		int birler = sayi % 10;

		if (sayi > 100) {
			System.out.println("Basamaklar Toplami : " + (birler + onlar + yuzler));
		} else {

			System.out.println("birler basamagi" + birler);
		}

	}

	private static void sayiTekmiCiftmi(int sayi) {

		if (sayi % 2 == 0) {
			System.out.println("sayi cift");
		} else {
			System.out.println("sayi tek");

		}

	}

	private static void sifirdanBuyukMu(int sayi) {

		if (sayi > 0) {
			System.out.println("sayi sifirdan buyuk");
		} else {
			System.out.println("sayi sifirdan kucuk");

		}
	}

}
