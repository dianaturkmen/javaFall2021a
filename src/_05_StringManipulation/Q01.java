package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
     
    	Scanner scan=new Scanner(System.in);
    	System.out.println("bir cumle giriniz");
    	String cumle=scan.nextLine();
    	boolean boslukVarMi=cumle.contains(" ");
    	System.out.println("bosluk var mi  "+ boslukVarMi);
    	boolean bosMu=cumle.isEmpty();
    	System.out.println("bos mu  "+ bosMu);

    	
    	
    }
}

