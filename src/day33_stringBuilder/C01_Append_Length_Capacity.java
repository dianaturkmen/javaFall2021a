package day33_stringBuilder;


public class C01_Append_Length_Capacity {

	public static void main(String[] args) {

		StringBuilder sb= new StringBuilder();
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		
		StringBuilder sb2= new StringBuilder("Java Candir");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		StringBuilder sb3= new StringBuilder(7);
		
		sb3.append("Mehlika");
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());
		
		StringBuilder sb4= new StringBuilder(7);
		System.out.println(sb4.length());
		System.out.println(sb4.capacity());
		sb4.append("Nilgun");
		
		System.out.println(sb4.length());
		System.out.println(sb4.capacity());
		
		sb4.append(" candir");
		System.out.println(sb4.length());
		System.out.println(sb4.capacity());
		
		sb.append("Java");
		System.out.println(sb);
		
		sb.append(" candir");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb.append("anlasildi mi",3,6);
		System.out.println(sb);

		


	}

}
