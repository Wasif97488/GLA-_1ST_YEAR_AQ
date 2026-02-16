package Lec23_12_Feb;

public class Pattern4 {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			//task1 
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			
			//task2
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
}
