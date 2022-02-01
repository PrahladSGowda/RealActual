package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
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
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Sample1 {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException{
	FileInputStream fis=new FileInputStream("C:\\Users\\user\\Desktop\\commonData.properties.txt");
	Properties p=new Properties();
	Thread.sleep(2000);
	p.load(fis);
	Thread.sleep(2000);
	String URL = p.getProperty("url");
	Thread.sleep(2000);
	String USERNAME = p.getProperty("username");
	String PASSWORD = p.getProperty("password");
	String BROWSER = p.getProperty("browser");
	
	Random ran=new Random();
	int rannum = ran.nextInt(2424);
	FileInputStream fis_ex=new FileInputStream("C:\\Users\\user\\Desktop\\Test data.xlsx");
	Workbook book = WorkbookFactory.create(fis_ex);
	Sheet s = book.getSheet("sheet1");
	Row r = s.getRow(0);
	String value = r.getCell(0).getStringCellValue()+rannum;
	WebDriver driver=null;
	if(BROWSER.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(BROWSER.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(BROWSER.equals("ie"))
	{
		driver=new InternetExplorerDriver();
	}
	else
	{
		driver=new ChromeDriver();
		
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(URL);
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASSWORD);
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	driver.findElement(By.xpath("//a[.='Organizations']")).click();
	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(value);
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	WebElement address = driver.findElement(By.xpath("//span[.='[ ACC14 ] dash1 -  Organization Information']"));
	if(address.equals(value))
	{
		System.out.println("dash");
	}
}
}
