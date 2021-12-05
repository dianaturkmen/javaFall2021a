package day33_stringBuilder;


public class C02_Delete {

	public static void main(String[] args) {

		StringBuilder sb=new StringBuilder ("Java candir can");
		
		sb.deleteCharAt(11);
		System.out.println(sb);


		sb.delete(11,13);
		System.out.println(sb);
		sb.delete(11, sb.length());
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.delete(5, 256);
		System.out.println(sb);
		System.out.println(sb.capacity());

	}

}
