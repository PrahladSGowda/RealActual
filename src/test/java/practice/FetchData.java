package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class FetchData {
@Test
public String fromExcel(String s,int column) throws Throwable, Throwable
{
	FileInputStream fis=new FileInputStream("./data/TestDataForMMT.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet(s);
	int row = sheet.getLastRowNum();
	String value="";
	for (int i = 1; i <=row; i++) {
		   value = sheet.getRow(i).getCell(column).toString();
	}
	return value;
}
}
