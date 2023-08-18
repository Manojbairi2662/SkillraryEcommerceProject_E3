package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WriteDataTo_Excel {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\WriteData.xlsx.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//String title = driver.getTitle();
		
		wb.getSheet("Sheet1").createRow(3).createCell(0).setCellValue("Hello manoj");
		// create an object for the fileoutstream
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\WriteData.xlsx.xlsx");
		wb.write(fos);

	}

}
