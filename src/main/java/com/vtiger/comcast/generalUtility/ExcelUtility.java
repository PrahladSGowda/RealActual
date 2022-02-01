package com.vtiger.comcast.generalUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author user
 *
 */

public class ExcelUtility {
public String getExcelData(String sheetName,int rowNum,int cellNum) throws Throwable, Throwable
{
	FileInputStream fis=new FileInputStream("./data/Test data.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet s = book.getSheet(sheetName);
Row r = s.getRow(rowNum);
String value = r.getCell(cellNum).getStringCellValue();
book.close();
return value;
}
/**
 * 
 * @param sheetName
 * @return
 * @throws Throwable
 */
public int getRowcount(String sheetName) throws Throwable
{
	FileInputStream fis=new FileInputStream("./data/Test data.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet s = book.getSheet(sheetName);
	book.close();
	return s.getLastRowNum();
}
public void setExcelData(String sheetName,int rowNum,int cellNum,String value) throws Throwable
{
	FileInputStream fis=new FileInputStream("./data/Test data.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet s = book.getSheet(sheetName);
	Row r = s.getRow(rowNum);
	Cell cell = r.createCell(cellNum);
	cell.setCellValue(value);
	FileOutputStream fos=new FileOutputStream("./data/Test data.xlsx");
	book.write(fos);
	book.close();	
}
}
