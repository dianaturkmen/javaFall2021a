package day05_matematikselIslemler;

import java.util.Scanner;


public class C03_Modules {

	public static void main(String[] args) {

	
		Scanner scan=new Scanner (System.in) ;
		System.out.println("lutfen 3 basamakli bir sayi giriniz");
		int sayi=scan.nextInt();
				
				int rakamlarToplami=0;
		int rakam=sayi%10;
		rakamlarToplami+=rakam;
		
		sayi/=10;
	
	rakam=sayi%10;
	sayi/=10;
rakamlarToplami+=sayi;
	
	System.out.println("Girdigniz sayinin rakamlar tolplami:" +rakamlarToplami);
	
	}

}
