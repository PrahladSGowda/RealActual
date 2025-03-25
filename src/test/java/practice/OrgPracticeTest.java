package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtiger.comcast.generalUtility.BaseClass;
import com.vtiger.comcast.pomrepositorylib.HomeNew;
import com.vtiger.comcast.pomrepositorylib.NewOrgInfoPage;
import com.vtiger.comcast.pomrepositorylib.OrgPage;

public class OrgPracticeTest extends BaseClass {
@Test(dataProvider="getData")
public void createPracticeOrg(String orgName,String ind)
{
	HomeNew h=new HomeNew(driver);
	h.getOrgLink().click();
	OrgPage org=new OrgPage(driver);
	org.getCreateOrgLink().click();
	NewOrgInfoPage oin=new NewOrgInfoPage(driver);
	oin.OrgInfoBusiness(orgName+"-"+jLib.getRanDomNumber(),ind);
	wLib.mouseHover(driver, h.getImgToGetSignOut());
	h.getSignOutLink().click();
	
}
@DataProvider
public Object[][] getData() throws Throwable
{
	Object[][] data = eLib.getmultipleData("Sheet1");
	return data;
}

}
