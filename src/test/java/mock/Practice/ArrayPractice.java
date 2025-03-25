package mock.Practice;

public class ArrayPractice {

	public static void main(String[] args) {
		
		String s="1A2B33C4D4";
		int sum=0;
		String temp="";
		for (char c : s.toCharArray()) {
			if(c>='0' && c<='9')
			{
				temp+=c;
			}
			else if (!temp.isEmpty()) {
				
				sum+=Integer.parseInt(temp);
				temp="";
			}
			
		}
		if (!temp.isEmpty()) {
			
			sum+=Integer.parseInt(temp);
		}
		System.out.print(sum);
		
				/*int[] y={1,2,3,4,5,6,8,9,10};
				int n=y.length+1;
				int SumOfAll=n*(n+1)/2;
				int sum=0;
				for (int i = 0; i < y.length; i++) {
					sum=sum+y[i];
				}
				System.out.println("missing Number is -->"+(SumOfAll-sum));

		
		
		
		
		/*int [] z= {27,5,8,45,23};
		int Fmax=0;
		int Smax=0;
		
		for (int i = 0; i < z.length; i++) {
			if(z[i]>Fmax) {
				Smax=Fmax;
				Fmax=z[i];
			}
			else if (z[i]>Smax) {
				Smax=z[i];
			}
		}
		System.out.println(Fmax);
		System.out.print(Smax);
		
		
		
		
		
		
		int [] a= {34,53,78,45,9};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
}*/
	}

}
