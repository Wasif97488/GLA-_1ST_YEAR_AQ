package Lec10_21_Jan;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class User_Input2 {
	public static void main(String[] args) throws IOException{
		Scanner s = new Scanner(System.in);
		
		{
		int a=s.nextInt();
		double d = s.nextDouble();
		boolean c=s.nextBoolean();
		String s1 = s.next();
		System.out.println(a);
		System.out.println(d);
		System.out.println(c);
		System.out.println(s1);
//		ArrayList a = new ArrayList();
		FileReader f = new FileReader("c:");
		Double d1 = new Double("d");
//		Float f = new Float("103.490");
		Thread t = new Thread();
		Stack s2 = new Stack();
		
		}
	}

}
