package Lec24_13_Feb;

public class Pattern8 {
	
	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			//task 1
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			//task 2
			for(int k=2*(n-i)-1;k>=1;k--)
			{
				System.out.print(" ");
			}
			
			//task 3
			for(int l=1;l<=i;l++)
			{
				if(l==n)
					break;
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
