package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_TypeEx {

	public static void main(String[] args) throws Throwable {
		// managing drivers
		WebDriverManager.chromedriver().setup();
				
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Entering the URL
		driver.get("https://demo.actitime.com/login.do"); 
				
		// maximize the screen
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		
		if(username.isDisplayed())
		{
			username.sendKeys("admin");
		}
		else
		{
			System.out.println("text field is not displayed");
		}
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@name,'pwd')]"));
		
		if(password.isDisplayed())
		{
			password.sendKeys("manager");
		}
		else
		{
			System.out.println("Password not displayed");
		}
		
		WebElement login = driver.findElement(By.xpath("//a[@class='initial']"));
		if(login.isEnabled())
		{
			login.click();
		}
		else
		{
			System.out.println("Login not successfull");
		}
		Thread.sleep(2000);
		
		WebElement Viewtimetrack = driver.findElement(By.xpath("//a[contains(text(),'View Time-Track')]"));
		
		if(Viewtimetrack.isEnabled())
		{
			Viewtimetrack.click();
		}
		else
		{
			System.out.println("Viewtimetrack not displayed");
		}
		Thread.sleep(2000);
		
        WebElement logtimetrack = driver.findElement(By.xpath("//a[(text()='Lock Time-Track')]"));
		
		if(logtimetrack.isEnabled())
		{
			logtimetrack.click();
		}
		else
		{
			System.out.println("logtimetrack not displayed");
		}
		driver.quit();

	}

}