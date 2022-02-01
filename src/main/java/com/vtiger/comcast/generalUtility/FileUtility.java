package com.vtiger.comcast.generalUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {
public String getPropertyFiles(String key) throws Throwable
{
	FileInputStream fis=new FileInputStream("./data/RealTime.properties.txt");
	Properties pro=new Properties();
	pro.load(fis);
	String value = pro.getProperty(key);
	return value;
}
}
