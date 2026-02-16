package Lec19_05_Feb;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==0)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}

}
