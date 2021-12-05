package Homework;

import java.util.Scanner;

public class mailKontrol {

	public static void main(String[] args) {
		/*Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre 
		- @ isareti icermiyorsa gecersiz email yazdirin
		- @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
		- @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz*/
		
		
		Scanner scan=new Scanner(System.in);
		String email=scan.next();
		System.out.println("Lutfen emailinizi giriniz");
	}

}
