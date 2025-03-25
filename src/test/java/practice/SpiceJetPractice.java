package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetPractice {
@Test
public void getJet() throws Throwable
{
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.spicejet.com/");
	//driver.findElement(By.xpath("//*[name()='svg']//*[name()='circle' and @fill='#EDB16A']")).click();
	driver.findElement(By.xpath("//div[.='round trip' and @class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa' ]")).click();
	driver.findElement(By.xpath("//div[.='From' and @class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2']")).click();
	driver.findElement(By.xpath("//div[.='Bengaluru' and @class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']")).click();
	//driver.findElement(By.xpath("//div[.='To' and @class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2']")).click();
	driver.findElement(By.xpath("//div[.='Belagavi' and @class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79']")).click();
	driver.findElement(By.xpath("//div[.='October 2024' and @class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']"
			+ "/ancestor::div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']"
			+ "//div[.='13' and @class='css-76zvg2 r-homxoj r-ubezar r-16dba41']")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[.='Return Date']")).click();
	
	driver.findElement(By.xpath("//div[.='October 2024' and @class='css-76zvg2 r-homxoj r-adyw6z r-1kfrs79']"
			+ "/ancestor::div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']"
			+ "//div[.='14' and @class='css-76zvg2 r-homxoj r-ubezar r-16dba41']")).click();
	driver.findElement(By.xpath("//div[.='Passengers']")).click();
	WebElement passengers = driver.findElement(By.xpath("//div[.='Adult']/ancestor::div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1x0uki6']"
			+ "//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid']"));
	passengers.click();
	passengers.click();
	passengers.click();
	
	WebElement done = driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']"));
//	Point loc = done.getLocation();
//	System.out.println(loc);
//	int x = loc.getX();
//	int y = loc.getY();
//	JavascriptExecutor js=(JavascriptExecutor) driver;
//	js.executeScript("window.scrollBy("+x+","+y+")");
	done.click();
	driver.findElement(By.xpath("//div[.='Currency']")).click();
	driver.findElement(By.xpath("//div[.='AED' and @class='css-76zvg2 r-homxoj r-ubezar']")).click();
	driver.findElement(By.xpath("//div[.='Family & Friends' and @class='css-1dbjc4n']")).click();
	driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();

	driver.findElement(By.xpath("//div[contains(.,'I have read and agreed to the ') and @class='css-1dbjc4n r-13awgt0 r-18u37iz']//div[@class='css-1dbjc4n r-1tf5bf9 r-1777fci r-1ww30s9']")).click();
	driver.findElement(By.xpath("//div[contains(.,'I have read and agreed to the ') and @class='css-1dbjc4n r-13awgt0 r-18u37iz']//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
}
}
