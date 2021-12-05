package Homework_string_Manupulations;

import java.util.Scanner;

public class StringMan_TerstenYazdirma {

	public static void main(String[] args) {
	//	Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.


		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 4 harfli bir kelime yaziniz");
		String kelime=scan.next();
		
		int l=kelime.length();
		
		if (l==4) {
				System.out.println(kelime.substring(3)+
									(kelime.substring(2,3)+
									kelime.substring(1,2)+
									kelime.substring(0,1)));		
		}
	
		else
			System.out.println("Gecersiz kelime");
				
	}

}
