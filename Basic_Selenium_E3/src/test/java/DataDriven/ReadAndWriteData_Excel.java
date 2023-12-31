package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadAndWriteData_Excel 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Creating an object for physical file
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\ReadData.xlsx.xlsx");
		
		//Create an workbook factory
		Workbook wb = WorkbookFactory.create(fis);
		//get the value
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		driver.get(url);
		
		String title = driver.getTitle();
		wb.getSheet("Sheet1").createRow(3).createCell(0).setCellValue(title);
		// create an object for the fileoutstream
		FileOutputStream fos = new FileOutputStream(".\\src\\test\\resources\\Testdata.xlsx.xlsx");
		wb.write(fos);		

	}

}
