package vTiger_OrganisationsHardcoding.Test;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Create_org_with_Shipping_address_Test {

	public static void main(String[] args) throws Throwable{
		FileInputStream fis=new FileInputStream("./data/RealTime.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
		String BROWSER = pro.getProperty("browser");
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASS = pro.getProperty("password");
		//String ORG = pro.getProperty("org");
		FileInputStream fis_ex=new FileInputStream("./data/Test data.xlsx");
		Workbook book = WorkbookFactory.create(fis_ex);
		Sheet s = book.getSheet("sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String value = c.getStringCellValue();
		WebDriver driver=null;
		if(BROWSER.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(URL);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASS);
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(value);
		driver.findElement(By.xpath("(//input[@name='cpy'])[1]")).click(); 
		driver.findElement(By.xpath("//input[@value='  Save  ']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Information')]"));
		String text = ele.getText();
		System.out.println(text);
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	}

}
