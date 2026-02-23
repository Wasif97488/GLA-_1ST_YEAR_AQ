package Lec25_17_Feb;

public class Pattern10 {
	
	public static void main(String[] args) {
		
		int n=5;
		//outer loop
		int star=0;
		for(int i=1;i<=2*n-1;i++)
		{
			//mirror condition
			if(i<=n)
			star=i;	
			else
				star--;
			
			//task 1 star
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			
			
			
		}
	}

}
