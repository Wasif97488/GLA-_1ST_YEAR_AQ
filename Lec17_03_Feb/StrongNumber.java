package Lec17_03_Feb;

import java.util.Scanner;

public class StrongNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			int rem = temp%10;
			int fact = 1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum = sum+fact;
			
			temp=temp/10;
			
		}
		if(num==sum)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not Strong Number");
		}
	}

}
