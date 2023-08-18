package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Property_Browser 
{
	public static void main(String[] args) throws Throwable 
	{
		Properties pro = new Properties();
		
		//create an object for physical file
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		
		// loading fis
		pro.load(fis);
		String Url = pro.getProperty("url");
		String browse = pro.getProperty("browser");
		
		WebDriver driver;
		if(browse.equals("chrome"))
		{
			// managing drivers
	        WebDriverManager.chromedriver().setup();
	       // opening the empty browser
			driver = new ChromeDriver();
		}
		else
		{
			// managing drivers
			WebDriverManager.firefoxdriver().setup();
			// opening the empty browser
			driver = new FirefoxDriver(); 
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url);
	}

}
