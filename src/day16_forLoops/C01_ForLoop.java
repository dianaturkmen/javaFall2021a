package day16_forLoops;

public class C01_ForLoop {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.print(i+"  ");
		} 
		
		// for loop baslangic ve bitis sarti bir sayinin degerine bagli olan durumlarda tercih edilir.
	/*
	 *  (int i = 0; i < 10; i--) {
	
		System.out.println(i+"  "); 
		}            */

		//eger baslangic sayisi artis/azalis ile bitis degerine yaklasmiyor uzklasiyor ise loop hic bir zaman durmaz
	// bu duruma sonsuz loop deriz ve bu durumun gerceklesmesini istemeyiz
	
		for (int i = 0; i > 10; i++) {
			System.out.println(i + "acaba calisir mi?");
		}
		//
		//eger ilk deger icin bitis sarti true olmazsa
		// daha ilk loopt ta loop broken olur
		// dolayisiyla loop body hic calismadan  loopun sonrasina gecilir.
		// loop CALISIR ama hic bir  ISLEM YAPMAZ
		
	}
	
	}
	


