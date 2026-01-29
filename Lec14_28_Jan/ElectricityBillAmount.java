package Lec14_28_Jan;

import java.util.Scanner;

public class ElectricityBillAmount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Unit Consumed:");
		int unit= sc.nextInt();
		double amount=0.0;
		if(unit<=100)
			amount= unit*2.5;
		else if(unit>100 && unit<=200)
			amount=100*2.5+(unit-100)*3.5;
		else
			amount=100*2.5+100*3.5+(unit-200)*5;
		
		
		if(amount>500)
		{
			amount=amount+amount*0.10;
			System.out.println("The Electricity bill amount is "+amount);
		}
		else
		{
			System.out.println("The Electricity bill amount is "+amount);
		}
		
	}
}
