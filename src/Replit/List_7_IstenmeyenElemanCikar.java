package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_7_IstenmeyenElemanCikar {

	public static void main(String[] args) {
		/*write a Java program to removes a 
		 * specific element from an array and
		 *  put the remaining elements in a new array and 
		 *  prints the new array

		Input :{1,2,3,4,5,6}

		element:6

		Output : [1,2,3,4,5] */
		
		int arr[]={1,2,3,6,4,5,6};
		int silinecek=6;
		List<Integer> sonlistem = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=silinecek){
				sonlistem.add(arr[i]);
			}		
		}
	int yeniArray[]= new int[sonlistem.size()];	
		for (int i = 0; i < yeniArray.length; i++) {
				yeniArray[i]= sonlistem.get(i);
				
		}
	System.out.println(Arrays.toString(yeniArray));
	}
}
