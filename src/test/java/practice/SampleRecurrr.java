package practice;

public class SampleRecurrr {
	
	public static void disp(int num)
	{
		if(num>=2)
		{
			if(num%2==0)
			{
				System.out.print(num+" ");
			}
			num--;
			disp(num);
		}
	}

	public static void main(String[] args) {
		disp(10);
	}

}
