package Lec18_04_Feb;

import java.util.Scanner;

public class SpyNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num= sc.nextInt();
		int sum=0,prd=1;
		while(num!=0)
		{
			int rem = num%10;
			sum=sum+rem;
			prd=prd*rem;
			num=num/10;
			
		}
		
		if(sum==prd)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not a Spy Number");
		}
		
	}

}
