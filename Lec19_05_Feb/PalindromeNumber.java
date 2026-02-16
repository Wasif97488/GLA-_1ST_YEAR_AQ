package Lec19_05_Feb;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev=0;
		int temp=num;
		while(temp!=0)
		{
			int rem = temp%10;
			rev = rev*10+rem;
			temp=temp/10;
		}
		if(rev==num)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome Number");
	}
     
}

