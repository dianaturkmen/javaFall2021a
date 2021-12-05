package Day19_whileLoop_DoWhileloop;

import java.util.Scanner;

public class C01_WhileLoop {

	public static void main(String[] args) {

		
		//Kullanicidan bir sayi alin
		//ve bu sayiyi tam bolen sayilari 
		//ve toplam kac adet olduklarini ekrana yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bolenlrini bulmak icin bir pozitif sayi giriniz");
		int sayi=scan.nextInt();
		
		int sayac=0;
		int bolen=1;
		
		while (bolen<=sayi) {
	if (sayi%bolen==0) {
		System.out.print(bolen + " ");
		sayac++;
		
	}		
		bolen++;
		}
		System.out.println("");
		System.out.println(sayi + " sayisinin " + sayac +" tam boleni vardir");

		
	}

}
