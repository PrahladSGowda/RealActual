package practice;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetExceutedTest {
@Test
public void spiceJetTest() throws InterruptedException
{
	SimpleDateFormat date=new SimpleDateFormat("dd/MM/yyyy");
	String currDate = date.format(new Date());
	System.out.println(currDate);
	String splitDate = currDate.replace("/", "");
	System.out.println(splitDate);
	String rev="";
	for(int i=splitDate.length()-1;i>=0;i--)
	{
		rev=rev+splitDate.charAt(i);
	}
	System.out.println(rev);
	
	if(rev.equals(splitDate))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
	
	
	
	/*ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	
	
	
	
	
	
	driver.findElement(By.xpath("//div[.='round trip']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='From']")).click();
	driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/ancestor::div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/descendant::div[.='Kempegowda International Airport']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='To']")).click();
	driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/ancestor::div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/descendant::div[.='Mangalore International Airport']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[.='March 2022']/ancestor::div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']/descendant::div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41' and .='12']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='March 2022']/ancestor::div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']/descendant::div[@class='css-76zvg2 r-homxoj r-ubezar r-16dba41' and .='13']")).click();
	Thread.sleep(4000);
	//driver.findElement(By.xpath("(//div[.='Search Flight'])[3]")).click();
	driver.findElement(By.xpath("//div[.='Welcome aboard.']/ancestor::div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
	Thread.sleep(2000);
	String text = driver.findElement(By.xpath("//span[contains(.,'Bengaluru')]")).getText();
	
	String text1 = driver.findElement(By.xpath("//span[contains(.,'12')]")).getText();
	String text2 = driver.findElement(By.xpath("//span[contains(.,'13')]")).getText();
	String text3 = driver.findElement(By.xpath("//span[contains(.,' 1 Adult ')]")).getText();
	Assert.assertEquals(text, " Round Trip : Bengaluru to Mangaluru");
	Assert.assertEquals(text1, "Depart Date : Sat, 12 Mar 2022");
	Assert.assertEquals(text2, "Return Date : Sun, 13 Mar 2022  ");
	Assert.assertEquals(text3, "Passengers :  1 Adult ");	*/
}
}
