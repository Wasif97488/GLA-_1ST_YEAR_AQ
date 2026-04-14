package Lec41_09_Apr;

public class FunctionWithPraraAndReturn {
	
	public static void main(String[] args) {
		int d=add(3,2);
		int e=factorial(d);
		square(e);
		 
	}
	
	public static int add(int a,int b)
	{
		int c = a+b;
		return c;
	}
	
	public static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static void square(int o)
	{
		System.out.println(o*o);
	}

}
