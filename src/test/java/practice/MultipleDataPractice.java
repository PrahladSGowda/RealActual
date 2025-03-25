package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtiger.comcast.generalUtility.ExcelUtility;

public class MultipleDataPractice 
{
	@Test(dataProvider="getData")
	public void multipleData(String orgName, String field)
	{
		System.out.println(orgName +" "+ field);
		
	}
	
	@DataProvider
	public Object[][] getData() throws Throwable
	{
		ExcelUtility eLib= new ExcelUtility();
		Object[][] data = eLib.getmultipleData("Sheet1");
		return data;
		
	}

}
