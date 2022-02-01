package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfo {
public OrganizationInfo(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement successfulMsg;

@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement verifyIndustry;

@FindBy(xpath="//a[@href='index.php?module=Contacts&action=index']")
private WebElement contactLink;

public WebElement getContactLink() {
	return contactLink;
}
public WebElement getVerifyIndustry() {
	return verifyIndustry;
}
public WebElement getSuccessfulMsg() {
	return successfulMsg;
}
}
