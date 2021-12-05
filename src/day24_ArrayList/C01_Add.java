package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_Add {

	public static void main(String[] args) {

		List<String> isimler=new ArrayList<>();
		System.out.println("bos liste:" + isimler);
		
		
		isimler.add("Ali");
		System.out.println("bir eleman:" + isimler);

		isimler.add("Veli");
		System.out.println("iki eleman:" + isimler);

		isimler.add("Can");
		System.out.println("uc eleman:" + isimler);
		isimler.add(1, "Ayse");
		System.out.println("birinci indexe Ayse:" + isimler);

		//isimler.add(5)declare ederken belirtigimiz data typeiniden baska data turu eklemesi yapilamaz
		List <String> liste2=new ArrayList<>();
		liste2.add("Gunter");
		liste2.add("Emrah");
		System.out.println("liste2 : " +liste2);

		isimler.addAll(2,liste2);
		
		System.out.println("sona liste 2 yi ekledik" + isimler);
		isimler.addAll(liste2);
		System.out.println("index olmadan liste2 yi tekrar ekledik" + isimler);
		
		
	}

}
