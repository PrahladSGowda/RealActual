package vTiger_OrganisationsHardcoding.Test;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectOption_isEnabled_Test {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./data/RealTime.properties.txt");
		Properties pro=new Properties();
		pro.load(fis);
		String BROW = pro.getProperty("browser");
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASS = pro.getProperty("password");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(PASS);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		WebElement ele = driver.findElement(By.xpath("(//input[@name='cpy'])[2]"));
		ele.click();
		boolean e = ele.isEnabled();
		//defect
		System.out.println(e);
		ele.click();
		//DEFECT
	}

}
