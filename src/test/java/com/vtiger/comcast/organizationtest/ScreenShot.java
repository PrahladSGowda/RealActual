package com.vtiger.comcast.organizationtest;

import java.io.File;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.vtiger.comcast.generalUtility.BaseClass;

public class ScreenShot extends BaseClass {
@Test
public void verifyHomePage(Method mtd) throws Throwable
{
	System.out.println(mtd.getName());
	String currentTestName = mtd.getName();
	System.out.println("test start");
	EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
	File srcFile = edriver.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./Screenshot/"+currentTestName+".png");
	FileUtils.copyFile(srcFile, destFile);
	System.out.println("test ends");
}
}
