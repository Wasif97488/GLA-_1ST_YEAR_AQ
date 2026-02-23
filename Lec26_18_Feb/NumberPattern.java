package Lec26_18_Feb;

public class NumberPattern {
	
	public static void main(String[] args) {
		int n=5;
		int space=0;
		for(int i=1;i<=2*n-1;i++)
		{
			
			//mirror condtion
			if(i<=n)
				space=i;
			else
				space--;
			
			//task 1 space
			for(int j=n-space;j>=1;j--)
			{
				System.out.print(" ");
			}
			//task 2 star
			for(int k=1;k<=2*space-1;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
