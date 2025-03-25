package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOrgInfoPage {
WebDriver driver;

@FindBy(xpath="//input[@name='accountname']")
private WebElement OrgNameTxt;
@FindBy(xpath="//select[@name='industry']")
private WebElement IndDropDown;
@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
private WebElement SaveBtn;

public NewOrgInfoPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getOrgNameTxt() {
	return OrgNameTxt;
}

public WebElement getIndDropDown() {
	return IndDropDown;
}

public WebElement getSaveBtn() {
	return SaveBtn;
}
public void OrgInfoBusiness(String orgName,String ind)
{
	OrgNameTxt.sendKeys(orgName);
	IndDropDown.sendKeys(ind);
	SaveBtn.click();
}
}
