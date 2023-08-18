package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Is_Selected 
{
	public static void main(String[] args) throws Throwable {
		// managing drivers
		WebDriverManager.chromedriver().setup();
				
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Entering the URL
		driver.get("https://www.facebook.com/"); 
				
		// maximize the screen
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement radiobutton = driver.findElement(By.xpath("//label[text()='Female']"));
		radiobutton.click();
		Thread.sleep(2000);
		
		if(radiobutton.isSelected())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
