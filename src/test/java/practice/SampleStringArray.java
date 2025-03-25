package practice;

public class SampleStringArray {

	public static void main(String[] args) {
		String[] str={"one","two","thrree","fivee","thrreeeeeeef", "thrreeeeeeee"};
		String max=str[0];
		
		for (int i = 1; i < str.length; i++) {
			
			if(str[i].length()>max.length())
			{
				max=str[i];
			}
		}
		System.out.println(max+"-->"+max.length());
		for (int i = 0; i < str.length; i++) {
			if(str[i].length()==max.length())
			{
				System.out.println(str[i]+"-->"+str[i].length());
			}
		}
		
	}

}
