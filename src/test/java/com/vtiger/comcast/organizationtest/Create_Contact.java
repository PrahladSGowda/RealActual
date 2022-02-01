package com.vtiger.comcast.organizationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.comcast.generalUtility.BaseClass;
import com.vtiger.comcast.pomrepositorylib.Contacts_Page;
import com.vtiger.comcast.pomrepositorylib.CreateNewOrganization;
import com.vtiger.comcast.pomrepositorylib.CreatingNewContactsPage;
import com.vtiger.comcast.pomrepositorylib.Home;
import com.vtiger.comcast.pomrepositorylib.OrganizationInfo;
import com.vtiger.comcast.pomrepositorylib.Organizations;
//@Listeners(com.vtiger.comcast.generalUtility.LisImpClass.class)
public class Create_Contact extends BaseClass {

	
	@Test(groups="smokeTest",enabled=false)
	public void CreateContactTest() throws Throwable
	{
		int randomInt = jLib.getRanDomNumber();
		String LN = fLib.getPropertyFiles("ln");
		
		Home h=new Home(driver);
	h.getContactLink().click();
	Contacts_Page cp=new Contacts_Page(driver);
	WebElement address = cp.getCreateContact();
	wLib.waitForElementToBeClickable(driver, address);
	address.click();
	
	CreatingNewContactsPage cncp=new CreatingNewContactsPage(driver);
	cncp.getLastNameEdt().sendKeys(LN+randomInt);
	cncp.getSaveBtn().click();
	String context = cp.getVerContact().getText();

	Assert.assertTrue(context.contains(LN), "contact is not verified");
	System.out.println("contact is verified");
	}
	@Test(groups="RegTest")
	public void CreateContactWithOrgTest() throws Throwable
	{
		int randomInt = jLib.getRanDomNumber();
		String LN = fLib.getPropertyFiles("ln");
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
		
		
		oinfo.getContactLink().click();
		Contacts_Page cp=new Contacts_Page(driver);
		cp.getCreateContact().click();
		CreatingNewContactsPage cncp=new CreatingNewContactsPage(driver);
		cncp.getLastNameEdt().sendKeys(LN+randomInt);
		cncp.getLookUpImgEdt();//click() removed
		wLib.SwitchToWindow(driver, "Accounts&action");
		op.getSearchOrgEdt().sendKeys(org);
		//wLib.waitForElementToBeClickable(driver,);
		op.getSearchNowBtn().click();
		driver.findElement(By.xpath("//a[.='"+org+"']")).click();
		wLib.SwitchToWindow(driver, "Contacts&action");
		cncp.getSaveBtn().click();
		String context = cp.getVerContact().getText();

		Assert.assertTrue(context.contains(LN), "contact with org is not verified");
		System.out.println("contact with org is verified");
	}
}

