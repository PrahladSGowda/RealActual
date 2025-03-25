package practice;

public class SampleFirstmaxWoSorting {

	public static void main(String[] args) {
		int [] arr= {45,32,76,24,7};
		int Fmax=0;
		int Smax=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>Fmax)
			{
				Smax=Fmax;
				Fmax=arr[i];
			}
			else if (arr[i]>Smax) {
				Smax=arr[i];
			} 
			
		}
System.out.println(Fmax);
System.out.println(Smax);
	}

}
