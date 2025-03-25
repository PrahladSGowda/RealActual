package practice;

import org.bouncycastle.asn1.cmp.OOBCertHash;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeDataProviderTest 
{
	@Test(dataProvider="getData")
	public void practiceData(String mobile, String model)
	{
		System.out.println(mobile+" and"+model);
		
	}


	
	@DataProvider(name="getData")
	public Object[][] getDataProvider()
	{
		Object[][] objArr= new Object[3][2];
		objArr[0][0]="mi";
		objArr[0][1]="m3";
		
		objArr[1][0]="relame";
		objArr[1][1]="v3";
		
		objArr[2][0]="vivo";
		objArr[2][1]="a5";
		
		return objArr;
		
	}
}
