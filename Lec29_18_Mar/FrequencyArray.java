package Lec29_18_Mar;

import java.util.Scanner;

public class FrequencyArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<size;i++)
		{
		if(a[i]>max)
			max=a[i];
		}
		
		int[] ans= new int[max+1];
		
		for(int i=0;i<size;i++)
		{
			ans[a[i]]++;
		}
		
		
		for(int i=0;i<ans.length;i++)
		{
			if(ans[i]>0)
				System.out.println(i+"  "+ans[i]);
		}
		
		
	}

}
