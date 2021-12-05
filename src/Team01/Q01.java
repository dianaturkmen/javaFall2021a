package Team01;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		//Kullanicidan ismini alip isminin bas harfini yazdirin.
		Scanner scan=new Scanner(System.in);
			System.out.println("Lutfen isminizi girin");

			char ilkHarf=scan.next().charAt(0);

		System.out.println("Isminizin ilk harfi: "+ ilkHarf);
		
	}

}
