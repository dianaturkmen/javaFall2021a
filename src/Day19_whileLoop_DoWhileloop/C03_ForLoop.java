package Day19_whileLoop_DoWhileloop;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		//Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin bir pozitif sayi giriniz");
		int sayi=scan.nextInt();
		
		
		int rakam=0;
		int rakamlarToplami=0;
		
				rakamlarToplami=0;
				String sayiStr=""+sayi;
				for (int i = 0; i < sayiStr.length(); i++) {
					rakam=sayi%10;
					rakamlarToplami+=rakam;
					sayi/=10;
					
					
				}
				System.out.println("girdiginiz sayinin rakamlar toplami:"+ rakamlarToplami);
				
	}

}
