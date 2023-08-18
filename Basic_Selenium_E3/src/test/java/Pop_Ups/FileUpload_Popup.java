package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_Popup {

	public static void main(String[] args) throws Throwable {
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Entering the URL
		driver.get("https://www.foundit.in/");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Manoj files\\\\Manoj Kumar resume\\\\Manoj Resume.pdf");
		

	}

}
