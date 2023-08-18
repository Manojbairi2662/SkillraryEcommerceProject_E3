package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAction_Amazon {

	public static void main(String[] args) {
		// managing drivers
		WebDriverManager.chromedriver().setup();
		
		// opening the empty browser
		WebDriver driver = new ChromeDriver();
		
		// Entering the URL
		driver.get("https://www.amazon.in/");
		
		// maximize the screen
		driver.manage().window().maximize();
		
		WebElement LoginAccount = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(LoginAccount).perform();
		
		driver.findElement(By.xpath("(//span[text()='Sign in'])[1]")).click();

	}

}
