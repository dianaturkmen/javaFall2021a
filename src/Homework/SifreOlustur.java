package Homework;

import java.util.Iterator;
import java.util.Scanner;

public class SifreOlustur {

	public static void main(String[] args) {

		boolean kucukharfvar=false;
		boolean buyukharfvar=false;
		boolean ozelharfvar= false;
		boolean kisami=false;
 
		
		Scanner scan=new Scanner(System.in);
		
		do {
			
		
			System.out.println("sifre giriniz: ");
			String sifre=scan.nextLine();
			
			
			kisami=uzunlukKontrolu(sifre);
			kucukharfvar=kucukKontrolu(sifre);
			buyukharfvar=buyukKontrolu(sifre);
			ozelharfvar=ozelkrkKontrol(sifre);
		
		} while (!(ozelharfvar&&buyukharfvar&&kucukharfvar&&kisami));
		System.out.println(" sifre ok");	
		
	 
			
		
	}

	
	
	private static boolean uzunlukKontrolu(String sifre) {
			if (sifre.length()>=8) {
				return true;
			}
		System.out.println("en az 8 karakter olami");	
		return false;
	}



	private static boolean ozelkrkKontrol(String kelime) {
			String ozelkrkler="£$%^&*()_+-=!\"£$%^&*()_+}{@:?>|¬<";
			for (int i = 0; i < ozelkrkler.length(); i++) {
				for (int j = 0; j < kelime.length(); j++) {
					if (ozelkrkler.charAt(i)==kelime.charAt(j)) {
						
						return true;	
					}		
				}	
			}
			System.out.println("ozel karakteryok sifre");	
			return false;
	}



	private static boolean buyukKontrolu(String kelime) {
		String buyukharf="AQWERTYUIOPLKJHGFDSAZXCVBNM";
		for (int i = 0; i < kelime.length(); i++) {
			for (int j = 0; j < buyukharf.length(); j++) {
				if (kelime.charAt(i)==buyukharf.charAt(j)) {
					
				return true;				} 
			}
		} 
		System.out.println("buyuk harf yok sifre");
		return false;
	}



	private static boolean kucukKontrolu(String kelime) {
		String kucukharfler="abcdefgwrtyplkjhgfdszxcvbnm";
		for (int i=0; i<kelime.length(); i++) {
			for (int j=0;j<kucukharfler.length(); j++ ) {
				if (kelime.charAt(i)==kucukharfler.charAt(j)) {
					
					return true;
				}
			}
		}	
		System.out.println("kucuk hatf yok sifre");
		return false;
	}

}
