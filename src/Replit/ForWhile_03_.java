package Replit;

public class ForWhile_03_ {

	public static void main(String[] args) {
		/*Write a code that returns the duplicate chars in a String array.(interview Question)

		Input :

		String str=“Javaisalsoeasy”

		Output: [a, s]
		*/
		
	     String e="Javaisalsoeasy";
	     
	     for(int i = 0; i < s.length(); i++) {  
	         for(int j = i + 1; j < s.length(); j++) {  
	             if(i!=j&&  s.charAt(i)==s.charAt(j) )  {
	            	 System.out.println(s.charAt(i));
	            	 break;
	            	 
	             }
	         }
	     }
	     
	    
}
}
