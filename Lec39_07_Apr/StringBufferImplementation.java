package Lec39_07_Apr;

public class StringBufferImplementation {
	
	public static void main(String[] args) {
//		
//		String s ="Hello";
//		s=s.concat("world");
//		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("   world   ");
		System.out.println(sb);
		sb.trimToSize();
		System.out.println(sb);
		
	}

}
