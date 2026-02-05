package Lec18_04_Feb;

import java.util.Scanner;

public class DuckNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		boolean flag=false;
		while(num!=0)
		{
			int rem = num%10;
			if(rem==0)
			{
				flag=true;
				break;
			}
			num=num/10;
		}
		if(flag==true)
			System.out.println("Duck Number");
		else
			System.out.println("Not  Duck  NUmber");
	}

}
