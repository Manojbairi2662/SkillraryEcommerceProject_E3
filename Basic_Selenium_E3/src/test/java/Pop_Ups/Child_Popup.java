package Pop_Ups;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_Popup 
{
	public static void main(String[] args) throws Throwable {
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Entering the URL
		driver.get("https://www.skillrary.com/");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		//handle parent window
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='ENGRANAJES']")).click();
		//driver.findElement(By.xpath(" //a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		
		Thread.sleep(2000);
		//handle child window
		Set<String> child = driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		Thread.sleep(2000);
		// address of element in child window
		driver.findElement(By.xpath("//input[@name='data']")).sendKeys("Manoj");
		driver.switchTo().window(parent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();
		driver.quit();
	}

}
