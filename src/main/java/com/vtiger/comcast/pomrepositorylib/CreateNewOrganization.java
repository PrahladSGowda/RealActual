package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganization {
public CreateNewOrganization(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(name="accountname")
private WebElement orgNameEdt;

@FindBy(xpath="//select[@name='industry']")
private WebElement industryDrop;

@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
private WebElement saveBtn;

public void createOrg(String org){
	orgNameEdt.sendKeys(org);
}

public WebElement getSaveBtn() {
	return saveBtn;
}

public WebElement getIndustryDrop() {
	return industryDrop;
}
}