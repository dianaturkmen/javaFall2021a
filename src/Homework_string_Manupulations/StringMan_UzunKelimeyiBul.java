package Homework_string_Manupulations;

import java.util.Scanner;

public class StringMan_UzunKelimeyiBul {

	public static void main(String[] args) {
		//Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.

		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen isminizi giriniz");
		String isim=scan.next();
				System.out.println("lutfen soyisminizi giriniz");
		String soyisim=scan.next();
		 int a=isim.length();
		 int b=soyisim.length();
		
		 System.out.println(a+" "+b);
		 if (a>b) {
			System.out.println("isminiz daha uzun    " + a );
		} else {
			System.out.println("soyisminiz daha uzun    " + b );

		}
	}

}
