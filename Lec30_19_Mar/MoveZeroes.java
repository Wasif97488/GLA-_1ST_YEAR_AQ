package Lec30_19_Mar;

import java.util.Scanner;

public class MoveZeroes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		
		int[] a = new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int k=0;
		int[] ans = new int[size];
		for(int i=0;i<size;i++)
		{
			if(a[i]!=0)
			{
				ans[k++]=a[i];
			}
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(ans[i]);
		}
		
		
	}

}
