package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List_02_Swap {

	public static void main(String[] args) {
		//Create a 10-element list. Swap the 8th element with the 3rd element.

		//INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan",
		//                        "Orhan","Sinan","Furkan","Ahmet","Ali"};

		//Output:

	//	[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]

		ArrayList <String> list=new ArrayList<> (Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan",
		"Orhan","Sinan","Furkan","Ahmet","Ali"));
		System.out.println(list);
		Collections.swap(list, 2, 7);
		System.out.println(list);
		
	}

}
