package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingData_FromFile 
{
	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//FileInputStream fis = new FileInputStream("C:\\java programs eclips\\Basic_Selenium_E3\\src\\test\\resources\\Flipkart.properties.txt");
		
		FileInputStream fis = new FileInputStream(".\\src/test/resources/Fetchingdata.properties.txt");
		
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("Url");
		driver.get(URL);
	}

}
