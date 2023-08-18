package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index?overview-summary.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//a[@target='packageFrame'])[2]")).click();
		
		/*driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		
		driver.findElement(By.xpath("(//a[text()='Help'])[1]")).click();*/
		
		
		
		
		
		
		

	}

}
