package day05_matematikselIslemler;

import java.util.Scanner;

public class C04_Modulus {

	public static void main(String[] args) {
//kullanicidan 4 basamakli alip rakamlar toplamini yazdirin
		//bu islmemi basamak sayisi kadar tekrar edersek rakamlar toplamini buluruz
		
		Scanner scan=new Scanner (System.in) ;
		System.out.println("lutfen 4 basamakli bir sayi giriniz");
		int sayi=scan.nextInt();
				
		int rakamlarToplami=0;
		int rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
	
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
		
		rakam=sayi%10;
		rakamlarToplami+=rakam;
		sayi/=10;
	
	System.out.println("Girdigniz sayinin rakamlar tolplami:" +rakamlarToplami);
	}

}
