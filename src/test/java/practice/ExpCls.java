package practice;

public class ExpCls {

	public static void main(String[] args) {
		int [] a= {1,2};
		
		try 
		{
			System.out.println(a[3]+"exception developed");
			int b=1/0;
		}
		catch(Exception e)
		{
			System.out.println("exception addressed");
		}

	}

}
