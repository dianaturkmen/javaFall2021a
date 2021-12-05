package Homework;

import java.util.Scanner;

public class Halil {

	public static void main(String[] args) {
// kelime gir harf gir
		//harfin kacinci yerde oldugunu yazsin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir kelime giriniz");
		String kelime=scan.next();
		
		System.out.println("bir harf giriniz");
		
		String harf=scan.next();
		
        int yeri= kelime.indexOf(harf);
        System.out.println(yeri);
        System.out.println(kelime.length());
        System.out.println(kelime.length()-2);
 
		
		
	} 

}
