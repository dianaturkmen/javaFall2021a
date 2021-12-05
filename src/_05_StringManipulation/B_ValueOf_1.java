package _05_StringManipulation;

public class B_ValueOf_1 {

	public static void main(String[] args) {

		String parakErkek="1900";
		String paraLKadin="2000";
		//Ailenin Toplam geliri nedir
		System.out.println(parakErkek+paraLKadin);//19002000
		
		System.out.println(Integer.valueOf(parakErkek)+Integer.valueOf(paraLKadin));// 3900
		
		
		int maasErkek=1900;
		int maasKadin=2000;
		System.out.println(String.valueOf(maasErkek)+String.valueOf(maasKadin));
	
		

        //Soru:  String olarak verilen 2 adet bagis parasının toplamini yazdiriniz.

        String bagis1="500";
        String bagis2="1500";
        
        
        int intbagis1=Integer.parseInt(bagis1);
        int intbagis2=Integer.parseInt(bagis2);
        
        int toplam=intbagis1+intbagis2;
System.out.println("toplam bagis =" +toplam);
        
// Soru :String olarak verilen karenin 1 kenar uzunluğundan
// karenin çevresinin uzunluğunu bulunuz.

String kenar="8";

int intkenar=Integer.parseInt(kenar);



System.out.println("karenin cevresi   :" + intkenar*4);

		
	}

}
