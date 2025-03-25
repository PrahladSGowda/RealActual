package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizations {
public Organizations(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//img[@alt='Create Organization...']")
private WebElement createOrgImg;

@FindBy(name="search_text")
private WebElement searchOrgEdt;

@FindBy(xpath="//input[@name='search']")
private WebElement searchNowBtn;

@FindBy(xpath="//a")
private WebElement orgName;

@FindBy(name="industry")
private WebElement indType;

public WebElement getCreateOrgImg() {
	return createOrgImg;
	
}

public WebElement getSearchOrgEdt() {
	return searchOrgEdt;
}

public WebElement getSearchNowBtn() {
	return searchNowBtn;
}

public WebElement getOrgName()
{
	return orgName;
}

public WebElement getIndType() {
	return indType;
}


}