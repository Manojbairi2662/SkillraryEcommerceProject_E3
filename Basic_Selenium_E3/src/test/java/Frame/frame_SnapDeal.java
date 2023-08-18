package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame_SnapDeal {

	public static void main(String[] args) throws Throwable {
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Entering the URL
		driver.get("https://www.snapdeal.com/");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		Actions move = new Actions(driver);
		move.moveToElement(signIn).perform();
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		
		//handle the frame name
        driver.switchTo().frame("loginIframe");	
        
		//driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']")).sendKeys("ManojKumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='close-pop']")).click();
		Thread.sleep(2000);
		//shifting our control to normal web page
		driver.switchTo().defaultContent();
	
	}

}
