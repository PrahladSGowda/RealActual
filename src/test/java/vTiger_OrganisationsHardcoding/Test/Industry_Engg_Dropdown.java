package vTiger_OrganisationsHardcoding.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vtiger.comcast.generalUtility.ExcelUtility;
import com.vtiger.comcast.generalUtility.FileUtility;
import com.vtiger.comcast.generalUtility.JavaUtility;
import com.vtiger.comcast.generalUtility.WebDriverUtility;

public class Industry_Engg_Dropdown {

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
	/*test script data*/
	String org = eLib.getExcelData("Sheet1", 0, 0)+randomInt;
	WebDriver driver=null;
	if(BROWSER.equals("chrome"))
	{
	driver=new ChromeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
	}
	wLib.waitForpageLoad(driver);
	driver.get(URL);
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASS);
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	driver.findElement(By.xpath("//a[.='Organizations']")).click();
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(org);
	WebElement ele2 = driver.findElement(By.xpath("//select[@name='industry']"));
	wLib.select(ele2, "Engineering");
	WebElement ele3 = driver.findElement(By.xpath("//select[@name='accounttype']"));
	wLib.select(ele3, "Customer");
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
	WebElement ele1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	wLib.mouseHover(driver, ele1);
	driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	}
	}
