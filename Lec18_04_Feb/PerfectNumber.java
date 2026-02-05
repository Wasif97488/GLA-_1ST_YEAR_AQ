package Lec18_04_Feb;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int sum=1;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==num)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not a Perfect Number");
		}
	}

}
