package practice;


public class SamplePrimeOrNot {

	public static void main(String[] args) {
		int n=17;
		Boolean flag=true;
		for (int i = 2; i <n ; i++) {
			
			if(n%i==0) {
				
				flag=false;
			}
		}
			if(flag==true)
			{
				System.out.println(n+" is a prime");
			}
			else
			{
				System.out.println(n+" is not a prime");
			}
		}

	}
