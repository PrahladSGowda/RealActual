package com.vtiger.comcast.generalUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
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
/**
 * This method will read the multiple data from excel by using data provider
 * @return 
 * @throws Throwable
 */
public Object[][] getmultipleData(String sheet) throws Throwable
{
	FileInputStream fis= new FileInputStream("./data/Test data.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheet);
	int lastrow = sh.getLastRowNum();
	int lastcell = sh.getRow(0).getLastCellNum();
	Object[][] arr= new Object[lastrow][lastcell];
	for(int i=0;i<lastrow;i++)
	{
		for(int j=0;j<lastcell;j++)
		{
			arr[i][j] = sh.getRow(i+1).getCell(j).getStringCellValue();
		}
	}
	return arr;
	
	
}
public Object[][] excelDataForEcomm(String sheet) throws Throwable
{
FileInputStream fis=new FileInputStream("./data/Test data.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet sh = book.getSheet(sheet);
int lastRow = sh.getLastRowNum();
int lastColumn = sh.getRow(0).getLastCellNum();
Object[][] obj = new Object[lastRow][lastColumn];

for(int i=0;i<lastRow;i++)
{
	for(int j=0;j<lastColumn;j++)
	{
		obj[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
	}
}
return obj;
}

}
