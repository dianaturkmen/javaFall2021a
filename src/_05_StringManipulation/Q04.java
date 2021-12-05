package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        
     Scanner scan=new Scanner(System.in);
     System.out.println("4 harfli bir kelime giriniz");
     String kelime=scan.next();
     
     if (kelime.length()!=4) {
    	 System.out.println("Tekrar deneyiniz"); 
     
		
	} else {
		System.out.println("Kelimenin tersi :" ) ;
	System.out.println(kelime.substring(3)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1));
	

	

		
	}
	}
    		 
}
