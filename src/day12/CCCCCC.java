package day12;

import java.util.Scanner;

public class CCCCCC {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 1. ismi giriniz");
		String isim1=scan.next();
		System.out.println("Lutfen 2. ismi giriniz");
		String isim2=scan.next();
		String cevap=(isim1.charAt(0)==isim2.charAt(0)&&((isim1.length()==isim2.length())))
				?("kardessiniz") :(  (isim1.charAt(0)==isim2.charAt(0))?("ayni"):  ("farkli"));
		
		System.out.println(cevap);
		
		
		
		
	}

}
