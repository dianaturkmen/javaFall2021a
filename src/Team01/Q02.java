package Team01;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		//     // Soru 1.  Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdirin
	   
		Scanner scan=new Scanner(System.in);
		System.out.println("2 tam sayi  giriniz");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int toplam=(a+b);
		int fark=(a-b);
		int carpim=(a*b);
		int bolum=(a/b);

		
		
		System.out.println("Toplam " +toplam);
		System.out.println("fark " +fark);
		System.out.println("carpim " +carpim);
		System.out.println("bolum " +bolum);
		
		
		
		
	}

}
