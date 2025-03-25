package practice;

public class SampleAdd2Array {

	public static void main(String[] args) {
		int [] a= {2,5,7};
		int [] b= {3,6,9,5};
		int count=a.length;
		
		if(b.length>a.length)
		{
			count=b.length;
		}
		for (int i = 0; i < count; i++) {
			try {
				System.out.print(a[i]+b[i]+" ");
			}
			catch (Exception e) {

				if(a.length>b.length)
				{
					System.out.print(a[i]+" ");
				}
				else
				{
					System.out.print(b[i]+" ");
				}
			}
			
			
		}

	}

}
