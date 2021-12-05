package day04_Increment_Decrement;

public class C04_Expicit_Narrowing {

	public static void main(String[] args) {

		int sayi1=140;
		short sayi2=(short)sayi1;
		
		System.out.println(sayi2);
		
		byte sayi3=(byte) sayi2;
		System.out.println(sayi3);
		
		
		double sayi4=87.3;
		
		int sayi5=(int) sayi4;
		
		System.out.println(sayi5);
		
		int sayi6=27;
		int sayi7=4 ;
		
		double sayi8=4;
			
		System.out.println(sayi6/sayi8);
		
		

	}
	

}
