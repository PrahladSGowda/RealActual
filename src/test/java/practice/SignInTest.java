package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInTest {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//span[.='Sign in']")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//input[@id='continue']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('ap_email').value='prahladsgowda27@gmail.com'");
		//js.executeScript("document.getElementById('continue').click()");
		js.executeScript("arguments[0].click();", element);
	}

}
