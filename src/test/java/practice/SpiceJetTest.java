package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetTest {
@Test
public void locationTest() throws AWTException, InterruptedException
{
	//FirefoxOptions options=new FirefoxOptions();
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='round trip']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='From']")).click();
	driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/ancestor::div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/descendant::div[.='Kempegowda International Airport']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='To']")).click();
	driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/ancestor::div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/descendant::div[.='Mangalore International Airport']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[.='Departure Date']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79' and contains(.,'March ') and contains(.,'2022')]| //div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41' and contains(.,'10')])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[.='Add Return Date'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='March ']/ancestor::div[@class='css-1dbjc4n r-18u37iz']/descendant::div[.='18']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
	
	//Assert.assertEquals("", expected);
	
	
}
}
