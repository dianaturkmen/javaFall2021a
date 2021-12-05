package Team01;

import java.util.ArrayList;
import java.util.Arrays;

public class TeamArray {

		public static void main(String[] args) {
			/* If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
	        * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}  
	        *{3, 6, 18, 17}
	        */
			
			ArrayList <Integer> list=new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5, 7));
			ArrayList <Integer> yeniList=new ArrayList<>();
		
			int silinenEleman=0;
			int toplam=0;
			int sayac=0;
			
			
			while(list.size()>0) {
				
				sayac++;
				
				if (sayac>list.size()){
				break;
				}
				for (int j = 1; j <=sayac; j++) {
					
					silinenEleman=list.remove(0); //Her dongude ilk eleman listeden cikarilip, gecici toplama eklenir
					toplam=toplam+silinenEleman;
				}
				yeniList.add(toplam); //Dongu bitince toplam yeni liste eleman olarak eklenir 
				toplam=0;
			}
			
			System.out.println(yeniList);
			
		}

	}

