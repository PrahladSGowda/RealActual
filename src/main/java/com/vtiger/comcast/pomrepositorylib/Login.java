package com.vtiger.comcast.pomrepositorylib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
public Login(WebDriver driver){
	PageFactory.initElements(driver, this);
}
@FindBy(name = "user_name")
private WebElement userNAmeEdt;

@FindBy(name="user_password")
private WebElement userPasswordEdt;

@FindAll({@FindBy(id="submitButton"),@FindBy(xpath="//input[@id='submitButton']")})
private WebElement loginBtn;

public WebElement getUserNAmeEdt() {
	return userNAmeEdt;
}

public WebElement getUserPasswordEdt() {
	return userPasswordEdt;
}

public WebElement getLoginBtn() {
	return loginBtn;
}
public void logintoApp(String userNAme,String password)
{
	userNAmeEdt.sendKeys(userNAme);
	userPasswordEdt.sendKeys(password);
	loginBtn.click();
}
}
