package practice;

import java.util.Scanner;

public class SampleScan {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a valid Word");
		String w=s.next();
		String rev="";
		for (int i = w.length()-1; i>=0; i--) {
			
			rev=rev+w.charAt(i);
		}
		if(w.equals(rev))
		{
			System.out.println(w+" is a panlindrome");
		}
		else
		{
			System.out.println(w+" is not a panlindrome");
		
		}

	}

}
