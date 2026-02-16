package Lec24_13_Feb;

public class Pattern7 {
	
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			//task 1 
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			
			//task 2
			for(int k=1;k<=2*i-1;k++)
			{
				if(k%2==0)
				System.out.print("!");
				else
				System.out.print("*");
			}
			System.out.println();
			
			
		}
	}

}
