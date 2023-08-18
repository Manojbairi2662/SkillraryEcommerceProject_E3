package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HiddenOrCalender_Popup {

	public static void main(String[] args) {
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Entering the URL
		driver.get("https://www.redbus.in/");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		
		driver.findElement(By.xpath("//div[text()='Aug']/../../../..//span[text()='24']")).click();

	}

}
