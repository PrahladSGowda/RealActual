package com.vtiger.comcast.organizationtest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vtiger.comcast.generalUtility.BaseClass;
import com.vtiger.comcast.pomrepositorylib.CreateNewOrganization;
import com.vtiger.comcast.pomrepositorylib.Home;
import com.vtiger.comcast.pomrepositorylib.OrganizationInfo;
import com.vtiger.comcast.pomrepositorylib.Organizations;

public class CreateOrgWithMultiDataTest extends BaseClass
{
	@Test(dataProvider="getData")
	public void createOrgWithMultiTest(String orgName,String indType) throws InterruptedException
	{
		Home hp= new Home(driver);
		hp.getOrgLink().click();
		
		Organizations op= new Organizations(driver);
		op.getCreateOrgImg().click();
		
	
		orgName=orgName+""+jLib.getRanDomNumber();
		CreateNewOrganization cno= new CreateNewOrganization(driver);
		cno.createOrg(orgName);
		cno.getIndustryDrop().sendKeys(indType);
		Thread.sleep(3000);
		cno.getSaveBtn().click();
		
		
		OrganizationInfo oip= new OrganizationInfo(driver);
		String orgHeader = oip.getSuccessfulMsg().getText();
		Assert.assertTrue(orgHeader.contains(orgName));
		
	}
	
	@DataProvider
	public Object[][] getData() throws Throwable
	{
		Object[][] data = eLib.getmultipleData("Sheet2");
		return data;
	}

}
