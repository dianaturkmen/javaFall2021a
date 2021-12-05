package Team01;

import java.util.Scanner;

public class StringManupilation_0 {

	public static void main(String[] args) {

		//Soru 1) Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup 
		//olmadigini yazdirin

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String kelime=scan.nextLine();
		System.out.println("Bir harf giriniz");
		String harf=scan.next();
		
		if (kelime.indexOf(harf)==(-1)) {
			System.out.println("bu harf yok");
		} else {
			System.out.println("bu harf varert");

		}
		


		
	}

}
