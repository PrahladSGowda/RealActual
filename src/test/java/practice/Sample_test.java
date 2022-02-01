package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample_test {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("localhost:8888");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	Thread.sleep(1000);
	
}
}
