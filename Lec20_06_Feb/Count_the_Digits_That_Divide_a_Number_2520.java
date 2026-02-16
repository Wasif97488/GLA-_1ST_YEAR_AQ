package Lec20_06_Feb;

import java.util.Scanner;

public class Count_the_Digits_That_Divide_a_Number_2520 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		int temp=n;
		while(temp!=0)
		{
			int rem = temp%10;
			if(n%rem==0)
				count++;
			temp=temp/10;
		}
		System.out.println(count);
	}

}
