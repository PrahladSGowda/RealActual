package practice;

public class ReverseEachWordInWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String str="Welcome to Bengaluru";
		String [] sp=str.split(" ");
		
		for (int i =0 ; i<=sp.length-1 ; i++) {
			
			String sp1=sp[i];
			for (int j =sp1.length()-1; j>=0 ; j--) {
				
				System.out.print(sp1.charAt(j));
				
			}
			System.out.print(" ");
		}*/
		
		String s="abc45de12fg1"; //13
		int sum=0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9' )
			{
				int num=s.charAt(i)-48;
				sum+=num;
			}
		}
		System.out.println(sum);
	}

}
