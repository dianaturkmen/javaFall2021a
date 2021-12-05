package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q07_BuyukKucukHmi {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir karakter giriniz:");
		
		char karakter=scan.next().charAt(0);
		
		String sonuc=(karakter>='a' && karakter<='z') ?"kucuk harf" : ( (karakter>='A' && karakter<='Z')? "Buyuk":"Hatali"   );
		System.out.println(sonuc);
	}

}
