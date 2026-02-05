package Lec16_30_Jan;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number");
int num=sc.nextInt();
int sum=0;
while(num!=0)
{
	int rem=num%10;
	sum=sum+rem;
	
	num/=10;			
}
System.out.println("The sum of digit is :"+sum);
}
}
