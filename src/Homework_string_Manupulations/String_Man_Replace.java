package Homework_string_Manupulations;

public class String_Man_Replace {

	public static void main(String[] args) {

	/* Soru 1) String methodlarini kullanarak 
		“ Java ogrenmek123 Cok guzel@ ” String’ini 
		“Java ogrenmek cok guzel.” sekline getirin.*/
		
		
		String cumle="Java ogrenmek123 Cok guzel@";
		
		cumle=cumle.replaceAll("\\d", "");

		cumle=cumle.replaceAll(" ", "8");

		cumle=cumle.replaceAll("\\W", "");
		cumle=cumle.replaceAll("\\d", " ");

		System.out.println(cumle.substring(0,1).toUpperCase()+cumle.substring(1).toLowerCase());

		
		
		
	}

	
	
	
}
