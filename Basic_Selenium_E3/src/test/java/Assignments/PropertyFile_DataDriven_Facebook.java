package Assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile_DataDriven_Facebook 
{
	public static void main(String[] args) throws Throwable 
	{
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize(); 
      
      //FileInputStream fis = new FileInputStream("C:\\java programs eclips\\Basic_Selenium_E3\\src\\test\\resources\\Data.properties");
      FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Data.properties");
      
      Properties pro = new Properties();
      pro.load(fis);
      
      String Url = pro.getProperty("url");
      String User = pro.getProperty("username");
      String Pwd = pro.getProperty("password");
      
      Thread.sleep(2000);
      
      driver.get(Url);
      driver.findElement(By.xpath("//input[@id='email']")).sendKeys(User);
      driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Pwd);
      driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
