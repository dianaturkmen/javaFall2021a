package Javapractice01;

import java.util.Scanner;

public class Practicesoru4 {

	public static void main(String[] args) {

	//kullanicidan iki tam sayi alip bu 2 sayinin dort islem sonucunu yazdirin	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 1. Sayiyi giriniz: ");
		double sayi1=scan.nextDouble();
		System.out.println("Lutfen 2. Sayiyi Giriniz:");
		double sayi2=scan.nextDouble();
		System.out.println("Toplam: " + (sayi1+sayi2)+"\n"+ "Fark: " + (sayi1-sayi2)
				+ "\n" +"Carpim: " +  (sayi1*sayi2)+  "\n"+ "Bolum: " + (sayi1/sayi2));
		
		
		
		

		
	
		
		
		
		
	}

}
