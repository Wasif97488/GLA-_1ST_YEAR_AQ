package Lec28_17_Mar;

import java.util.Scanner;

public class FirstAndLastElementSwap {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int temp;
		temp=a[0];
		a[0]=a[size-1];
		a[size-1]=temp;
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}

}
