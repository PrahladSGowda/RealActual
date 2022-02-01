package com.vtiger.comcast.organizationtest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vtiger.comcast.generalUtility.BaseClass;
import com.vtiger.comcast.pomrepositorylib.CreateNewOrganization;
import com.vtiger.comcast.pomrepositorylib.Home;
import com.vtiger.comcast.pomrepositorylib.OrganizationInfo;
import com.vtiger.comcast.pomrepositorylib.Organizations;

public class CreateOrganization extends BaseClass {
	@Test(groups="smokeTest")
	public void CreateOrgTest() throws Throwable
	{
		int randomInt = jLib.getRanDomNumber();
		String org = eLib.getExcelData("Sheet1", 0, 0)+randomInt;
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
	@Test(groups="RegTest")
	public void CreateOrgWithIndEnergy() throws Throwable
	{
		int randomInt = jLib.getRanDomNumber();
		String org = eLib.getExcelData("Sheet1", 0, 0)+randomInt;
		Home hp = new Home(driver);
		hp.getOrgLink().click();
		Organizations op = new Organizations(driver);
		op.getCreateOrgImg().click();
		CreateNewOrganization cno = new CreateNewOrganization(driver);
		cno.createOrg(org);
		wLib.select(cno.getIndustryDrop(), "Energy");
		cno.getSaveBtn().click();
		OrganizationInfo oinfo = new OrganizationInfo(driver);
		wLib.waitForElementToBeClickable(driver, oinfo.getVerifyIndustry());
		String actSuMsg = oinfo.getVerifyIndustry().getText();
		
		Assert.assertTrue(actSuMsg.contains(org), "org with industry is not verified"); 
		System.out.println("org with industry is verified");
	}
	
	}
