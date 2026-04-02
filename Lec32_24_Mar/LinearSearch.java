package Lec32_24_Mar;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size = sc.nextInt();
		
		
		int[] arr = new int[size];
		System.out.println("Enter the element of an array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element to be search:");
		int element = sc.nextInt();
		int count=0;
		int i=0;
		for(;i<size;i++)
		{
			if(arr[i]==element)
			{
//				System.out.println(i);
				count++;
			break;
			}
//			else
//				System.out.println(-1);
		}
		if(count>0)
			System.out.println(i);
		else
		System.out.println(-1);
	}

}
