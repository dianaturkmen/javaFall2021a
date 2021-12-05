package day33_stringBuilder;

public class C06_SubSquence {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Java ne kadar kolay");

		System.out.println(sb.substring(14));
		
		System.out.println(sb.substring(14,19));
		
		//ikisi de ayni sonucu dondurur, ancak substring methodu string clsindan geldigi icin 
		//substring() kullandigimda string metodlarini kullanabilirim
		//ancak subsquence kullndigimda bu mumkun olmaz

	}

}
