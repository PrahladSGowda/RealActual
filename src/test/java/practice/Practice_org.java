package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vtiger.comcast.generalUtility.ExcelUtility;
import com.vtiger.comcast.generalUtility.FileUtility;
import com.vtiger.comcast.generalUtility.JavaUtility;
import com.vtiger.comcast.generalUtility.WebDriverUtility;
import com.vtiger.comcast.pomrepositorylib.Home;
import com.vtiger.comcast.pomrepositorylib.Login;

public class Practice_org {

	public static void main(String[] args) throws Throwable {
		JavaUtility jLib=new JavaUtility();
		FileUtility fLib=new FileUtility();
		WebDriverUtility wLib=new WebDriverUtility();
		ExcelUtility eLib=new ExcelUtility();
		
		String URL = fLib.getPropertyFiles("url");
		String USERNAME = fLib.getPropertyFiles("username");
		String PASS = fLib.getPropertyFiles("password");
		String BROWSER = fLib.getPropertyFiles("browser");
		String LN = fLib.getPropertyFiles("ln");
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
		Login login=new Login(driver);
		login.logintoApp(USERNAME, PASS);
		Home home=new Home(driver);
		home.getOrgLink().click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
