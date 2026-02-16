package Lec19_05_Feb;

public class AddDigits_258 {
	
	public static void main(String[] args) {
		int num=299;
		int sum=0;
		while(num>9)
		{
		while(num!=0)
		{
			int rem = num%10;
			sum= sum+rem;
			num=num/10;	
		}
		if(sum<=9)
			System.out.println(sum);
		num=sum;
		sum=0;

		}
		
	}

}
