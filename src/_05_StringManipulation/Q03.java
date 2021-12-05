package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

    	Scanner scan=new Scanner(System.in);
    	 System.out.println("Adinizi ve soyadinizi giriniz");
    	String adSoyad=scan.nextLine()    ;
    	
    	String ad=adSoyad.substring(0, adSoyad.indexOf(" ")).toUpperCase();
    	String soyad=adSoyad.substring(adSoyad.indexOf (" ") +1).toUpperCase();
    	
    	String soyad2=adSoyad.substring(adSoyad.lastIndexOf (" ") +1).toUpperCase();

    	
System.out.println(" isim ve soy sisim basharfleri=" + ad.charAt(0)+"."+soyad.charAt(0)+"."+soyad2.charAt(0)+".");
    	
    }
    
}
