package com.vtiger.comcast.generalUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.vtiger.comcast.pomrepositorylib.Home;
import com.vtiger.comcast.pomrepositorylib.Login;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	public JavaUtility jLib = new JavaUtility();
	public WebDriverUtility wLib = new WebDriverUtility();
	public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public static WebDriver sDriver;
	@BeforeSuite(groups={"smokeTest" ,"RegTest"})
	public void configBS()
	{
		System.out.println("conn to db");
	}
	
	//@Parameters("BROWSER")
	@BeforeClass(groups={"smokeTest" ,"RegTest"})
	public void configBC(/*String BROWSER*/) throws Throwable
	{
		String URL = fLib.getPropertyFiles("url");
		String BROWSER = fLib.getPropertyFiles("browser");
		if(BROWSER.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		     driver=new ChromeDriver();
		
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		wLib.waitForpageLoad(driver);
		driver.manage().window().maximize();
		driver.get(URL);
		sDriver=driver;
	}
	
	@BeforeMethod(groups={"smokeTest" ,"RegTest"})
	public void configBM() throws Throwable
	{
		String USERNAME = fLib.getPropertyFiles("username");
		String PASS = fLib.getPropertyFiles("password");
		
		Login lp = new Login(driver);
		lp.logintoApp(USERNAME, PASS);
		
	}
	@AfterMethod(groups={"smokeTest" ,"RegTest"})
	public void configAM()
	{
		Home hp = new Home(driver);
		hp.logout();
	}
	@AfterClass(groups={"smokeTest" ,"RegTest"})
	public void configAC()
	{
		driver.quit();
	}
	@AfterSuite(groups={"smokeTest" ,"RegTest"})
	public void configAS()
		{
			System.out.println("dissconn from db");
		}
	}
