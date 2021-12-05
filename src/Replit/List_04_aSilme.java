package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_04_aSilme {

	public static void main(String[] args) {
		/*Write a program that deletes the letters 'a' from the names in the list given as input.

	     INPUT : 
	     list1={"Ali","Veli","Ayse","Fatma","Omer"}

	     OUTPUT : 
	     
	     [Veli,Omer]*/
		
		List<String> list1= new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
	    List<String> list2=new ArrayList<>();
		
	    for (String each :list1) {
	    	if (!each.toLowerCase().contains("a"))
	    		list2.add(each);
	    }

        System.out.println(list2);
	     
	}

}
