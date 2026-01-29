package Lec13_27_Jan;

import java.util.Scanner;

public class Calculating_Tax {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		{
		System.out.println("Enter the Income Amount");
		int income=	s.nextInt();
		double tax=0;
		if(income<=250000)
			tax=0;
		else if(income >250000 && income<=500000)
			tax=income*0.025;
		else if(income>500000 && income<=1000000)
			tax = income * 0.05;
		else
			tax=income*0.10;
		
		System.out.println("The Tax amount is "+tax);
		
				}
		
		
	}

}
