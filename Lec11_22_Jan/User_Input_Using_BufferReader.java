package Lec11_22_Jan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class User_Input_Using_BufferReader {
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s =br.readLine();
		
		 String s1=  br.readLine();
		int a= Integer.parseInt(s1);
		
		
		  double d=  Double.parseDouble(br.readLine());
		System.out.println(s);
		System.out.println(a);
		System.out.println(d);
	}

}
