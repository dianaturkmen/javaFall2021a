package day14_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {

		// Kullanicidan iki sayi isteyin
        // sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
        // kullaniciya us sorun
        // 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki sayi girin \nilk sayidan sonra enter'a basin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("girilen sayinin kareler toplamini istiyorsaniz 2"
				+ "\n kupler toplamini istiyorsaniz 3 e basin");
		
		int secim=scan.nextInt();
		
		switch (secim) {
		case 2:
			kareTopla(sayi1, sayi2);		
			
			break;
		case 3:
			kupToplami(sayi1, sayi2);		
			
			break;	
		
		default:
            System.out.println("Lutfen istenen tercihlerden birini yapin");

			break;
		}
	
		
		
		
		
		
		
	
		
	}

	public static void kupToplami(double sayi1, double sayi2) {
		double kupToplam=sayi1*sayi1*sayi1+sayi2*sayi2*sayi2;
		System.out.println("sayilarin kupler toplami=  " +kupToplam);
		
		
	}

	public static void kareTopla(double sayi1, double sayi2) {
		double kareToplami=sayi1*sayi1+sayi2*sayi2;
		System.out.println("sayilarin kareleri toplami=  " +kareToplami);
		
		
	}
	}
