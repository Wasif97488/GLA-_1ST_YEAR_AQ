package Lec31_20_Mar;

public class FindHighestAltitute_1732 {
	
	public static void main(String[] args) {
		int a[] = {-5,1,5,0,-7};
		int sum=0,max=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			if(sum>max)
			{
				max=sum;
			}
		}
		System.out.println(max);
	}

}
