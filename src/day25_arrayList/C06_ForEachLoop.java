package day25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
		// bazen index ile ugrasmadan bir array veya tum elemanlari gozden gecirmaek isteriz
		
		
		int arr[]= {1,2,3,5,3,2,7};
		
		
		List<Integer> yeniList=new ArrayList<>();
		/*
		for (int i = 0; i < arr.length; i++) {
			yeniList.add(arr[i]);
		}
		System.out.println(yeniList);
		*/
		
		for (int each : arr) { //arr deki her bir itegri getir
			
			yeniList.add(each);
		}
		System.out.println(yeniList);

		//Eger bir list veya array in tum elemanlarini eled gecirmaek istiyorsak 
		//ve siralama onemli degilse  for -each loop kullaniriz
	}

}
