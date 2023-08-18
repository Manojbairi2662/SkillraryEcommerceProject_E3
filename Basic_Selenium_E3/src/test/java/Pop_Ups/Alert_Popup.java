package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Popup {

	public static void main(String[] args) throws Throwable {
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Entering the URL
		driver.get("https://demoapp.skillrary.com/ ");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		WebElement course = driver.findElement(By.id("course"));
		
		Actions a = new Actions(driver);
		a.moveToElement(course).perform();
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		
		Thread.sleep(2000);		
		driver.findElement(By.xpath(" //button[text()=' Add to Cart']")).click();
		
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		
		

	}

}
