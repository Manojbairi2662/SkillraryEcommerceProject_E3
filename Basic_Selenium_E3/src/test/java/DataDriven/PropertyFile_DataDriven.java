package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile_DataDriven {

	public static void main(String[] args) throws Throwable 
	{		
		//create an object for physical file
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
		
		//create an object for properties class
		Properties pro = new Properties();
		
		// loading fis
		pro.load(fis);
		String Url = pro.getProperty("url");
		String User = pro.getProperty("username");
		String Pass = pro.getProperty("password");
		
		// managing drivers
        WebDriverManager.chromedriver().setup();
       // opening the empty browser
		WebDriver driver = new ChromeDriver();
		//maximize the screen
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(Url);
		
		// Fetching the address of username text field
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys(User);
		
		// Fetching the address of password text field
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(Pass);
		// Fetching the address of login button
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
