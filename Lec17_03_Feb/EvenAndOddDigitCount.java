package Lec17_03_Feb;

import java.util.Scanner;

public class EvenAndOddDigitCount {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int evenCount=0,oddCount=0;
		
		while(num!=0)
		{
			int rem=num%10;
			if(rem%2==0)
				evenCount++;
			else
			   oddCount++;
			
			num=num/10;
		}
		
		System.out.println("The Even COunt are "+evenCount+" The Odd COunt are"+oddCount);
	}

}
