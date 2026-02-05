package Lec16_30_Jan;

import java.util.Scanner;

public class CountOfDigit {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int count=0;
		while(num!=0)
		{
//			int rem=num%10;
			count++;
			num/=10;			
		}
		System.out.println("The count is :"+count);
	}

}
