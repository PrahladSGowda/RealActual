package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactsPage {
public CreatingNewContactsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindAll({@FindBy(name="lastname"),@FindBy(xpath="//input[@class='detailedViewTextBox']")})
private WebElement lastNameEdt;

@FindBy(xpath="//input[@name='account_name']/following-sibling::img")
private WebElement lookUpImgEdt;

@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveBtn;

public WebElement getSaveBtn() {
	return saveBtn;
}
public WebElement getLastNameEdt() {
	return lastNameEdt;
}
public WebElement getLookUpImgEdt() {
	return lookUpImgEdt;
}
}
