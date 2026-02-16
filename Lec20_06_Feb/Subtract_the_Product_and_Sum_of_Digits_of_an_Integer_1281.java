package Lec20_06_Feb;

import java.util.Scanner;

public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum =0,prd=1;
		while(n!=0)
		{
			int rem = n%10;
			sum = sum+rem;
			prd= prd*rem;
			n=n/10;
		}
		
		System.out.println(prd-sum);
		
		
	}

}
