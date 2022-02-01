package vTiger_OrganisationsHardcoding.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.comcast.generalUtility.ExcelUtility;
import com.vtiger.comcast.generalUtility.FileUtility;
import com.vtiger.comcast.generalUtility.JavaUtility;
import com.vtiger.comcast.generalUtility.WebDriverUtility;

public class Contact_Organization {
	public static void main(String[] args) throws Throwable {
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility wLib = new WebDriverUtility();
		FileUtility fLib = new FileUtility();
		ExcelUtility eLib = new ExcelUtility();
		int randomInt = jLib.getRanDomNumber();
		
		/*common data*/
		String USERNAME = fLib.getPropertyFiles("username");
	String PASS = fLib.getPropertyFiles("password");
	String URL = fLib.getPropertyFiles("url");
	String BROWSER = fLib.getPropertyFiles("browser");
	String LN = fLib.getPropertyFiles("ln");
	/*test script data*/
	String org = eLib.getExcelData("Sheet1", 0, 0)+randomInt;
	WebDriver driver=new ChromeDriver();
	wLib.waitForpageLoad(driver);
	driver.get(URL);
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASS);
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	driver.findElement(By.xpath("//a[.='Organizations']")).click();
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(org);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Organization ')]"));
	String text = ele.getText();
	System.out.println(text);
	if(text.contains(org))
	{
		System.out.println(org+"==>created successfully");
	}
	else
	{
		System.out.println(org+"==>not created successfully");
	}
	driver.findElement(By.xpath("//a[.='Contacts']")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(LN);
	driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
	wLib.SwitchToWindow(driver, "Org");
	driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(org);
	jLib.pressVirtualKey();
	driver.findElement(By.xpath("//a")).click();
	driver.findElement(By.xpath("//input[@class='crmButton small save']")).click();
	WebElement ele4 = driver.findElement(By.xpath("//span[.='//input[@class='crmButton small save']']"));
	String text1 = ele4.getText();
	if(text1.contains(LN))
	{
		System.out.println(LN+"==>created successfully");
	}
	else
	{
		System.out.println(LN+"==>not created successfully");
	}
	
	WebElement ele1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	wLib.mouseHover(driver, ele1);
	driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	}
	}