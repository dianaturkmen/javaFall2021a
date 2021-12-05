package day03_scanner;

import java.util.Scanner;

public class C06Scanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen isminizi giriniz:" );
		
		String isim=scan.nextLine();
		
		
		System.out.println("Lutfen Soyisminizi yaziniz: ");
	 	
		String soyisim=scan.nextLine();
		
		System.out.println("girilen isism: "+ isim +" " +soyisim);
		
	scan.close();
	}

}
