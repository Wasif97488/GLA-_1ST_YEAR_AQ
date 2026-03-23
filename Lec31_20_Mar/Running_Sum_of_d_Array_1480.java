package Lec31_20_Mar;

public class Running_Sum_of_d_Array_1480 {
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum=sum+nums[i];
			nums[i]=sum;
		}
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
	}

}
