package com.vtiger.comcast.generalUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisImpClass extends BaseClass implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		String currentsysdate = jLib.getsysDAte_YYYY_MM_DD();
		String testName = result.getMethod().getMethodName();
		System.out.println(testName+"execute and im listening");
		EventFiringWebDriver eDriver=new EventFiringWebDriver(BaseClass.sDriver);
	File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(srcFile, new File("./Screenshots/"+testName+currentsysdate+".png"));
	} catch (IOException e) {

	}
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
}
