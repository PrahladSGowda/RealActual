package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteDataIntoExcel {
@Test
public void WriteData() throws Throwable
{
	FileInputStream fis=new FileInputStream("./data/Test data.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("sheet4");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int count = links.size();
	for (int i = 0; i < count; i++) {
		sh.createRow(i+1).createCell(1).setCellValue(links.get(i).getAttribute("href"));
	}
	FileOutputStream fout=new FileOutputStream("./data/Test data.xlsx");
	book.write(fout);
}
}
