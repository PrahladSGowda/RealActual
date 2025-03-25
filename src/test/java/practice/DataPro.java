package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro
{
@Test(dataProvider="dataOrgTest")
public void OrgData(String org,String industry)
{
	System.out.println("create organization" +org+ "with industry type"+industry);
}

@DataProvider
public Object[][] dataOrgTest()
{
	Object[][] objArr=new Object[4][2];
	
	objArr[0][0]="Bosch";
	objArr[0][1]="Manufacturing";
	
	objArr[1][0]="Qspiders";
	objArr[1][1]="Education";
	
	objArr[2][0]="IRCTC";
	objArr[2][1]="Government";
	
	objArr[3][0]="Selenium";
	objArr[3][1]="Engineering";
	return objArr;
}
}
