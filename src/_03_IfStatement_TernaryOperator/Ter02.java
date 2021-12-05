package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii değeri

    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("bir karakter giriniz: ");
    	char kark=scan.next().charAt(0);
    	
    	if (kark>='a' && kark<='z') {
    		System.out.println(kark + " kucuk harftir");
    		
    	} 
    	else if (kark>='A' && kark<='Z') {
    		System.out.println(kark + "  buyuk harftir");
	
		}
    	else { System.out.println("Harf degil");

			
		}
    	
     	
    	
       
    }
}

