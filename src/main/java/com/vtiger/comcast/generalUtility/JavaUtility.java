package com.vtiger.comcast.generalUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Random;
/**
 * this class contains java specific generic libraries
 * @author user
 *
 */

public class JavaUtility {
public int getRanDomNumber()
{
	Random ranDom=new Random();
	int ranDomNum = ranDom.nextInt(10000);
	return ranDomNum;
}
public String geSystemDate()
{
	Date date=new Date();
	String sysDateAndTime = date.toString();
	return sysDateAndTime;
}
/**
 * it is used to get the current system date with YYYY-MM-DD format
 *@return
 */
 
public String getsysDAte_YYYY_MM_DD()
{
	Date date=new Date();
	String sysDateAndTime = date.toString();
	System.out.println(sysDateAndTime);
	String[] arr = sysDateAndTime.split(" ");
	String DD = arr[2];
	String YYYY = arr[5];
	int MM = date.getMonth()+1;
	String finalformat = YYYY+"-"+MM+"-"+DD;
	return finalformat;
}
/**
 * @throws Throwable 
 * 
 */
	public void  pressVirtualKey() throws Throwable
	{
		Robot rc=new Robot();
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
	}
}