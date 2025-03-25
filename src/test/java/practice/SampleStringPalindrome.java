package practice;

import java.util.Scanner;

public class SampleStringPalindrome {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter a name");
		String s=s1.next();
		//String s="Gadag";
		String rev="";
		for (int i = s.length()-1; i>=0 ; i--) {
			
			rev=rev+s.charAt(i);
		}
if(s.equalsIgnoreCase(rev))
{
	System.out.println(s+" is a palindrome");
}
else
{
	System.out.println(s+" is not a palindrome");
}
	}

}
