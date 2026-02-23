package Lec25_17_Feb;

public class ButterflyPattern {
	
	public static void main(String[] args) {
		int n=5;
		//outer loop
		int space=0;
		for(int i=1;i<=2*n-1;i++)
		{
			
			//mirror condition
			if(i<=n)
				space=i;
			else
				space--;
			//task 1 star
			for(int j=1;j<=space;j++)
			{
				System.out.print("*");
			}
			
			//task -2 space
			for(int k=2*(n-space)-1;k>=1;k--)
			{
				System.out.print(" ");
			} 
			
			//task 3 star
			for(int l=1;l<=space;l++)
			{
				if(l==n)
					break;
				System.out.print("*");
			}
			
			System.out.println();
			
			
			
		}
	}

}

