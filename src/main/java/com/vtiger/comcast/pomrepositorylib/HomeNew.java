package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeNew {
	public WebDriver driver;
@FindBy(xpath="//a[.='Calendar']/ancestor::tbody//a[.='Organizations']")
private WebElement OrgLink;
@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement ImgToGetSignOut;
@FindBy(xpath="//a[.='Sign Out']")
private WebElement SignOutLink;

public HomeNew(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getOrgLink() {
	return OrgLink;
}

public WebElement getImgToGetSignOut() {
	return ImgToGetSignOut;
}

public WebElement getSignOutLink() {
	return SignOutLink;
}
}
