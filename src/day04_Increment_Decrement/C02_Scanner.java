package day04_Increment_Decrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen Isminizi yaziniz: ");
		
		char ilkharf=scan.next().charAt(0);
		
		System.out.println("isminizin ilk harfi: "+  ilkharf);
		
		
	}

}
