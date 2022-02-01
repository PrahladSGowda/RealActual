package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contacts_Page {
public Contacts_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
private WebElement createContact;

@FindBy(xpath="//span[contains(.,'Contact')]")
private WebElement verContact;

public WebElement getVerContact() {
	return verContact;
}

public WebElement getCreateContact() {
	return createContact;
}
}
