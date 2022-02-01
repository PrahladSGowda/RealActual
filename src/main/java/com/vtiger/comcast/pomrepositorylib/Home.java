package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
public Home(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(linkText="Organizations")
private WebElement orgLink;

@FindBy(linkText="Products")
private WebElement productLink;

@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement adminImg;

@FindBy(linkText="Sign Out")
private WebElement signOutLink;

@FindBy(xpath="//a[.='Contacts']")
private WebElement contactLink;

public WebElement getContactLink() {
	return contactLink;
}
public WebElement getOrgLink() {
	return orgLink;
}
public WebElement getProductLink() {
	return productLink;
}
public WebElement getAdminImg() {
	return adminImg;
}
public WebElement getSignOutLink() {
	return signOutLink;
}
public void logout(){
	Actions act=new Actions(driver);
	act.moveToElement(adminImg).perform();
	signOutLink.click();
}
}
