package Lec42_10_Apr;

public class Overloading {
	
	public static void m1(int a)
	{
		System.out.println("Integer value");
		System.out.println(a);
	}
	
	public static void m1(double d)
	{
		System.out.println("Double value");
		System.out.println(d);
	}
	public static void main(String[] args) {
//		m1(10);
//		m1(10.5);
//		m1('a');
		byte  b= 10;
		m1(b);
	}

}
