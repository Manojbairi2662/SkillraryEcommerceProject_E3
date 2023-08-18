package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver_Action {

	public static void main(String[] args) 
	{
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Entering the URL
		driver.get("https://www.snapdeal.com/");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		//WebElement signIn = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(signIn).perform();
		
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
		
		
		
		
		
		
		

	}

}
