package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {

		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen isminizi giriniz:" );
		
		String isim=scan.next();
		
		System.out.println("Lutfen Soyisminizi yaziniz: ");
	 	
		String soyisim=scan.next();
		
		System.out.println("girilen isism: "+ isim +" " +soyisim);
		
		scan.close();
	}

}
