package Lec17_03_Feb;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		int temp=num;
		int temp1=num;
		int count=0;
		double sum=0;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		
		while(temp1!=0)
		{
			int rem=temp1%10;
			
			sum=sum+ Math.pow(rem, count);
			temp1=temp1/10;
		}
		
		if(sum==num)
		{
			System.out.println("ArmStrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
		
		
		
		
		
		
	}

}
