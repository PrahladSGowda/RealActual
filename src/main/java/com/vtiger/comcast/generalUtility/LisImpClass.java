package com.vtiger.comcast.generalUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LisImpClass extends BaseClass implements ITestListener{

	ExtentReports report;
	ExtentTest test;
	public void onFinish(ITestContext context) {
		report.flush();
		
	}

	public void onStart(ITestContext context) {
		ExtentSparkReporter htmlReport=new ExtentSparkReporter("./Extent-Reports"+new JavaUtility().getsysDAte_YYYY_MM_DD()+".html");
		htmlReport.config().setDocumentTitle("SDET-29 EXECUTION REPORT");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setReportName("Selenium Execution");
		report=new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("Base-browser", "chrome");
		report.setSystemInfo("OS", "windows");
		report.setSystemInfo("base-url", "http://localhost:8888");
		report.setSystemInfo("reporter-name", "prahlad");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
//implementation for itestlistener interface
	public void onTestFailure(ITestResult result) {
		String path=null;
		String screenshotName;
		
	String currentsysdate = jLib.getsysDAte_YYYY_MM_DD();
	 String testName = result.getMethod().getMethodName();
	 screenshotName=testName+currentsysdate;
//		System.out.println(testName+"execute and im listening");
//		EventFiringWebDriver eDriver=new EventFiringWebDriver(BaseClass.sDriver);
//	File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
	
		try {
			path=new WebDriverUtility().takeScreenshot(BaseClass.sDriver, screenshotName);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	test.log(Status.FAIL, testName+"failed");
	//it will capture the exception and login to report
	test.log(Status.FAIL, result.getThrowable());
	test.addScreenCaptureFromPath(path);
	}

	public void onTestSkipped(ITestResult result) {
	
		String testName = result.getMethod().getMethodName();
		test.log(Status.SKIP, testName+"skipped");
		test.log(Status.SKIP, result.getThrowable());
	}

	public void onTestStart(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		test = report.createTest(testName);
		
	}

	public void onTestSuccess(ITestResult result) {
		String testName = result.getMethod().getMethodName();
		test.log(Status.PASS, testName+"passed");
		
	}
}
