package practice;

import java.util.LinkedHashSet;

public class RemoveDuplicateInWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Welcome to to TestYantra Welcome";
		String []str=s.split(" ");
		for (String string : str) {
			System.out.print(string);
		}
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for (String str1 : str) {

			set.add(str1);
			
		}
		
		
		
		for (String str2 : set) {
			int count=0;
		for (String str3 : str) {
			if(str3.equals(str2))
			count++;
		}
		System.out.print(str2+"-> " +count+" ");
	}

}
}
