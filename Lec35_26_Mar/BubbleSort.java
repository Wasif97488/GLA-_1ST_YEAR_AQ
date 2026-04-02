package Lec35_26_Mar;

import java.util.Scanner;

public class BubbleSort {
   
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++)
		{
			int count=0;
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					count=1;
				}
			}
			if(count==0)
				break;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
