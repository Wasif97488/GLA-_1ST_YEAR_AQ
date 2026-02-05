package Lec17_03_Feb;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long fact = 1;
		
		for(long i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		
		System.out.println("The Factorial of "+num+" are "+ (fact));
	}

}
