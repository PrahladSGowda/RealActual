package practice;

public class SampleStaticNonBlocks {
	
	static {
		System.out.println("im static");
	}
	
	{
		System.out.println("im Non-static");
	}

	public static void main(String[] args) {
		
		SampleStaticNonBlocks b=new SampleStaticNonBlocks();
	}

}
