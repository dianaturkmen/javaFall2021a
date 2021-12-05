package Homework_string_Manupulations;

public class String_M02 {

	public static void main(String[] args) {
		/*Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
	String str1 = “$13.99”
	String str2 = “$10.55”
	ipucu : Double.parseDouble() methodunu kullanabilirsiniz.*/

		String str1="$13.99";

		String str2="$10.55";
		
		String sayi1=str1.replaceAll("\\D", "");
		System.out.println(sayi1);
		String sayi2=str2.replaceAll("\\D", "");
		System.out.println(sayi2);

		
double sayi01=Double.parseDouble(sayi1);
double sayi02=Double.parseDouble(sayi2);

System.out.println("Toplamm:" + (sayi01+sayi02));



	
		
		
				
				
				//double sayi1=Double.parseDouble(str1);
				//double sayi2=Double.parseDouble(str2);

		

	
		
	
		//int yeni2 = Integer.valueOf(ornek);
				

		
	}

}
