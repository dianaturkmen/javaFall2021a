package Day15_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {

		/*
		 * Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4
		 * degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin
		 * toplamini yazdirin. Kullanici toplamak istedigi sayi adedini 4’den buyuk
		 * girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen toplamak istediginiz sayi adedini 2,3 veya 4 den biri oarak secin");
		int tercih=scan.nextInt();
		if (tercih>4) {
			tercih=5;
		}

			
			switch (tercih) {
			case 2:
				System.out.println("jjfdbjdf");
				ikiSayiTopla();
				break;
				
			case 3:
				ucSayiTopla();
				break;	
			case 4:
				dortSayiTopla();
				break;
			case 5:
	            System.out.println("Cok sayi girdiniz, ben toplayamam");
	        	break;

			default:
	            System.out.println("gecersiz tercih");
			}
			
			
	
		}

	private static void ikiSayiTopla() {
		
		System.out.println("Lutfen iki sayi giriniz");
		Scanner scan=new Scanner(System.in);
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("girdiginiz sayilarin toplami  :" + (sayi1+sayi2));
		
		
		
		
		
		
		
		
	}

	private static void ucSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen uc sayi giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
	
		
		System.out.println("girdiginiz sayilarin toplami  :" + (sayi1+sayi2+sayi3));
		
		
		
	}

	private static void dortSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dort sayi giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();

		
		System.out.println("girdiginiz sayilarin toplami  :" + (sayi1+sayi2+sayi3+sayi4));		
	}
	}
