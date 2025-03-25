package practice;

public class SampleRevEachWordInASentence {

	public static void main(String[] args) {
		String s="Synechron is a asshole company";
		String [] sp=s.split(" ");
		for (int i = sp.length-1; i>=0 ; i--) {
			String s2=sp[i];
			String rev="";
			for (int j = s2.length()-1; j>=0 ; j--) {
				rev=rev+s2.charAt(j);
			}
			System.out.print(rev+" ");
		}
		
	}

}
