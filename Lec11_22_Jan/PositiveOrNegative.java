package Lec11_22_Jan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PositiveOrNegative {
	public static void main(String[] args) throws IOException{
	InputStreamReader isr = new InputStreamReader(System.in);	
	BufferedReader br = new BufferedReader(isr);
	System.out.println("Please Enter the Number");
	String s= br.readLine();
	int a = Integer.parseInt(s);
	if(a>0)
		System.out.println("Positive Number");
	else if(a<0)
		System.out.println("Negative Number");
	else
		System.out.println("0");
	}

}
