package practice;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtiger.comcast.generalUtility.BaseClass;
import com.vtiger.comcast.pomrepositorylib.CreateNewOrganization;
import com.vtiger.comcast.pomrepositorylib.Home;
import com.vtiger.comcast.pomrepositorylib.OrganizationInfo;
import com.vtiger.comcast.pomrepositorylib.Organizations;

public class ForDp extends BaseClass {
	@Test(dataProvider="dataOrgTest")
	public void CreateOrgTest(String org,String industry) throws Throwable
	{
		int randomInt = jLib.getRanDomNumber();
		//String org = eLib.getExcelData("Sheet1", i, 0)+randomInt;
	Home hp = new Home(driver);
	hp.getOrgLink().click();
	Organizations op = new Organizations(driver);
	op.getCreateOrgImg().click();
	CreateNewOrganization cno = new CreateNewOrganization(driver);
	cno.createOrg(org);
	cno.getSaveBtn().click();
	OrganizationInfo oinfo = new OrganizationInfo(driver);
	wLib.waitForElementToBeClickable(driver, oinfo.getSuccessfulMsg());
	String actSuMsg = oinfo.getSuccessfulMsg().getText();
	
	Assert.assertTrue(actSuMsg.contains(org), "org is not verified"); 
	System.out.println("org is verified");
	}
	@DataProvider
	public Object[][] dataOrgTest()
	{
		
		Object[][] objArr=new Object[i][2];
	
}
}
