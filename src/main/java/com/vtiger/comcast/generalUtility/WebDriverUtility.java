package com.vtiger.comcast.generalUtility;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
/**
 * 
 */

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
/*
 * 
 */
public class WebDriverUtility {
	/**
	 * 
	 * @param driver
	 */
public void maximisewindow(WebDriver driver)
{
	driver.manage().window().maximize();
}
public void waitForpageLoad(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
public void waitForElementToBeClickable(WebDriver driver,WebElement element)
		{
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(element));
		}
/**
 * @throws Throwable 
 * 
 */
public void waitAndClick(WebElement element) throws Throwable
{
	int count=0;
	while(count<20)
	{
		try{
			element.click();
			break;
		}
		catch (Exception e) {
			Thread.sleep(1000);
			count++;
		}
	}
}
/**
 * 
 */
public void select(WebElement element,String option)
{
	Select select = new Select(element);
	select.selectByVisibleText(option);
}
/**
 * 
 */
public void mouseHover(WebDriver driver,WebElement element)
{
	Actions act = new Actions(driver);
	act.moveToElement(element).perform();
}
/**
 * 
 */
public void RightClick(WebDriver driver,WebElement element)
{
	Actions act = new Actions(driver);
	act.contextClick(element).perform();
}
/**
 * 
 */
public void SwitchToWindow(WebDriver driver,String partialWinTitle)
{
	Set<String> whls = driver.getWindowHandles();
	Iterator<String> it = whls.iterator();
	while(it.hasNext())
	{
		String winId = it.next();
		String title = driver.switchTo().window(winId).getTitle();
	if(title.contains(partialWinTitle))
	{
		break;
	}
	}
}
/**
 * 
 */
public void cancelAlert(WebDriver driver)
{
	driver.switchTo().alert().accept();
}
/**
 * 
 */
public void AcceptAlert(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
}
/**
 * 
 */
public void scrollToWebElement(WebDriver driver,WebElement element)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	int y = element.getLocation().getY();
	js.executeScript("window.scrollBy(0,"+y+")",element);
}
public void switchFrame(WebDriver driver,int index)
{
	driver.switchTo().frame(index);
}
public void SwitchFrame(WebDriver driver,WebElement element)
{
	driver.switchTo().frame(element);
}
public void switchFrame(WebDriver driver,String IdOrName)
{
	driver.switchTo().frame(IdOrName);
}
public void takeScreenshot(WebDriver driver,String screenshotName) throws Throwable
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./screenshot/"+screenshotName+".PNG");
	Files.copy(src, dest);
}
/**
 * 
 */

public void passEnterKey(WebDriver driver)
{
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER).perform();
}

}
