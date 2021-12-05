package Team01;

public class C01_ {

	public static void main(String[] args) {
		 // kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
        // String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
        // { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
		
		   String str = "Javacilar cook afilli";
	        int Jharfi = 0,aharfi = 0,vharfi = 0,caharfi = 0, iharfi = 0, lharfi = 0,
	        rharfi = 0,fharfi = 0,harfi = 0, Bosluk = 0 ; 
	        
	        
	        for (int i = 0; i < str.length(); i++) {
	            if (str[i]equals " ")
	            	rharfi++;
	            
	            
	        }
	        System.out.println("8 den şu kadar adet var : " + sekizSayiAdeti);
	        System.out.println("7 den şu kadar adet var : " + yediSayiAdeti);
	        System.out.println("5 den şu kadar adet var : " + besSayiAdeti);
	        System.out.println("3 den şu kadar adet var : " + ucSayiAdeti);
	        System.out.println("2 den şu kadar adet var : " + ikiSayiAdeti);
	        System.out.println("1 den şu kadar adet var : " + birSayiAdeti);
			
		}
		
		
	}

}
