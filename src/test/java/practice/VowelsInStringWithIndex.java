package practice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class VowelsInStringWithIndex 
{
	public static void main(String[] args) 
	{
		String s="testyantra";
		String s1 = s.toLowerCase();
		for(int i=0;i<s1.length();i++)
		
		{
			if(s1.charAt(i)=='a'|| s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' ||s1.charAt(i)=='u')
			{
				
				System.out.print(s1.charAt(i)+"="+(i+1)+" ");
				
			}
		}
		
		
	}

}
