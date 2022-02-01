package vTiger_OrganisationsHardcoding.Test;

import java.util.Date;
import java.util.Random;

public class Generic {
public int getRandomNumber()
{
	Random ran= new Random();
	int rannum = ran.nextInt(1000);
	return rannum;
}
public String getCurrentDate()
{
	Date date=new Date();
	String currentDate = date.toString();
	return currentDate;
}
public String getFinalDateFormat()
{
	Date date=new Date();
	String d = date.toString();
	String[] dte = d.split(" ");
	String YYYY = dte[5];
	String DD = dte[2];
	String MM = dte[1];
	String today = YYYY+"-"+MM+"-"+DD;
	return today;
}
}
