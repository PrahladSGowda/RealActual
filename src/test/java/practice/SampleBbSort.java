package practice;

public class SampleBbSort {

	public static void main(String[] args) {
		int [] arr= {22,30,25,3,15};
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			
				
			}
		}
		for (int i = 0; i < arr.length-2; i++) {
			
		System.out.print(arr[i]+" ");
		}
		
		
		
	}
	}

