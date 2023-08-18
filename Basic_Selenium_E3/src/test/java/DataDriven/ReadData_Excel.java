package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadData_Excel {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis = new FileInputStream("C:\\java programs eclips\\Basic_Selenium_E3\\src\\test\\resources\\Testdata.xlsx.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		String URL = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		driver.get(URL);

	}

}
