package Lec37_01_Apr;

public class ReverseWord {
	
	public static void main(String[] args) {
		
		String s="Welcome to GLA University";
		
		      String[] ans = s.split(" ");
		      String a="";
		      
		      for(int i=ans.length-1;i>=0;i--)
		      {
		    	  a=a+" "+ans[i];
		    	  
		      }
		      System.out.println(a.trim());

	}

}
