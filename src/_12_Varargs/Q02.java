package _12_Varargs;

public class Q02 {
	public static void main(String[] args) {
		         // verilen int lerden ilki haric tum sayilari toplayan ve
				// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

		
		topla(2,3,4,5 );
		topla(10,3,1);
		
	}

	public static void topla(int carpilacakSayi, int ...toplanacakSayilar) {
	int toplam=0;
	for (int each : toplanacakSayilar) {
		
		toplam+=each;
		
	}
	System.out.println("sonuc : "+carpilacakSayi*toplam);	
		
		
		
}
	}