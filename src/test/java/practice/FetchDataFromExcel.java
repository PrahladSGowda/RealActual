package practice;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;


public class FetchDataFromExcel {

@Test
public void getData() throws Throwable
{
	FileInputStream fis=new FileInputStream("./data/Test data.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	 Sheet s = book.getSheet("sheet2");
	 int lrow = s.getLastRowNum();
	int lcell = s.getRow(0).getLastCellNum();
	for (int i = 0; i <lrow; i++) {
		for (int j = 0; j <lcell; j++) {
			System.out.println(s.getRow(i+1).getCell(j).getStringCellValue());
		}
		
	}
	
}

}
