package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgPage {
WebDriver driver;

@FindBy(xpath="//img[@title='Create Organization...']")
private WebElement CreateOrgLink;

public OrgPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getCreateOrgLink() {
	return CreateOrgLink;
}

}
